// ──────────────────────────────────────────────────
// Problem  : 2944. Minimum Number of Coins for Fruits
// Difficulty: Medium
// Tags     : Array, Dynamic Programming, Queue, Heap (Priority Queue), Monotonic Queue
// Link     : https://leetcode.com/problems/minimum-number-of-coins-for-fruits/
// Runtime  : 2 ms (beats 97%)
// Memory   : 45240000 (beats 90%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int minimumCoins(int[] prices) {
        int n = prices.length;
        int[] dp = new int[n + 1];
        
        for (int i = n; i >= 1; i--) {
            int maxFree = i + i;
            if (maxFree >= n) {
                dp[i] = prices[i - 1];
            } else {
                int minCost = Integer.MAX_VALUE;
                for (int j = i + 1; j <= maxFree + 1; j++) {
                    minCost = Math.min(minCost, dp[j]);
                }
                dp[i] = prices[i - 1] + minCost;
            }
        }
        return dp[1];
    }
}