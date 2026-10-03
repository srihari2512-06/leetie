# ──────────────────────────────────────────────────
# Problem  : 64. Minimum Path Sum
# Difficulty: Medium
# Tags     : Array, Dynamic Programming, Matrix
# Link     : https://leetcode.com/problems/minimum-path-sum/
# Runtime  : 20 ms (beats 20%)
# Memory   : 14192000 (beats 24%)
# Language : python
# Copyright: (c) 2026 srihari2512-06. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution(object):
    def minPathSum(self, grid):
        m, n = len(grid), len(grid[0])

        dp = [[0] * n for _ in range(m)]
        dp[0][0] = grid[0][0]

        for i in range(1, m):
            dp[i][0] = dp[i - 1][0] + grid[i][0]

        for j in range(1, n):
            dp[0][j] = dp[0][j - 1] + grid[0][j]

        for i in range(1, m):
            for j in range(1, n):
                dp[i][j] = min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j]

        return dp[m - 1][n - 1]