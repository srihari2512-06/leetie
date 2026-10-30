// ──────────────────────────────────────────────────
// Problem  : 375. Guess Number Higher or Lower II
// Difficulty: Medium
// Tags     : Math, Dynamic Programming, Minimax, Game Theory
// Link     : https://leetcode.com/problems/guess-number-higher-or-lower-ii/
// Runtime  : 39 ms (beats 25%)
// Memory   : 43584000 (beats 40%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];

        for (int i = n; i >= 0; i--) {
            // dp[i][i] = 0

            for (int j = i + 1; j <= n; j++) {
                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i; k <= j; k++) {
                    dp[i][j] = Math.min(dp[i][j],
                        k + Math.max(
                            (k - 1 >= i ? dp[i][k - 1] : 0),
                            (k + 1 <= j ? dp[k + 1][j] : 0)
                        )
                    );
                }
            }
        }

        return dp[1][n];
    }
}