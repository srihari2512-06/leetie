// ──────────────────────────────────────────────────
// Problem  : 486. Predict the Winner
// Difficulty: Medium
// Tags     : Array, Math, Dynamic Programming, Recursion, Minimax, Game Theory, Zero-Sum Game
// Link     : https://leetcode.com/problems/predict-the-winner/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42552000 (beats 73%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        if (n % 2 == 0) return true;
        
        int[] dp = nums.clone();
        for (int i = n - 2; i >= 0; --i) {
            for (int j = i + 1; j < n; ++j) {
                dp[j] = Math.max(nums[i] - dp[j], nums[j] - dp[j - 1]);
            }
        }
        return dp[n - 1] >= 0;
    }
}