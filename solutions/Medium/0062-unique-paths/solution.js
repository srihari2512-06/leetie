// ──────────────────────────────────────────────────
// Problem  : 62. Unique Paths
// Difficulty: Medium
// Tags     : Math, Dynamic Programming, Combinatorics
// Link     : https://leetcode.com/problems/unique-paths/
// Runtime  : 0 ms (beats 100%)
// Memory   : 52980000 (beats 85%)
// Language : javascript
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

var uniquePaths = function(m, n) {
    const dp = new Array(n);
        for (let i = 0; i < n; i++) {
            dp[i] = 1;
        }
        for (let i = 1; i < m; i++) {
            for (let j = 1; j < n; j++) {
                dp[j] += dp[j - 1];
            }
        }
        return dp[n - 1];
};