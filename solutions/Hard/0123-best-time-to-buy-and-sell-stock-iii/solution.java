// ──────────────────────────────────────────────────
// Problem  : 123. Best Time to Buy and Sell Stock III
// Difficulty: Hard
// Tags     : Array, Dynamic Programming
// Link     : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
// Runtime  : 3 ms (beats 55%)
// Memory   : 79932000 (beats 55%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int[] dp = new int[prices.length];
        for (int k = 1; k <= 2; k++) {
            int min = prices[0], last = 0;
            for (int i = 1; i < prices.length; i++) {
                min = Math.min(min, prices[i] - last);
                last = dp[i];
                dp[i] = Math.max(dp[i-1],  prices[i] - min);
            }
        }
        return dp[prices.length - 1];
    }
}