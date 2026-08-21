// ──────────────────────────────────────────────────
// Problem  : 3546. Equal Sum Grid Partition I
// Difficulty: Medium
// Tags     : Array, Matrix, Enumeration, Prefix Sum
// Link     : https://leetcode.com/problems/equal-sum-grid-partition-i/
// Runtime  : 4 ms (beats 94%)
// Memory   : 163496000 (beats 31%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        long totalSum = 0;
        long[] rowSums = new long[m];
        long[] colSums = new long[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                totalSum += grid[i][j];
                rowSums[i] += grid[i][j];
                colSums[j] += grid[i][j];
            }
        }

        if (totalSum % 2 != 0) {
            return false;
        }

        long target = totalSum / 2;

        long currentPrefix = 0;
        for (int i = 0; i < m  ; i++) {
            currentPrefix += rowSums[i];
            if (currentPrefix == target) {
                return true;
            }
        }

        currentPrefix = 0;
        for (int j = 0; j < n - 1; j++) {
            currentPrefix += colSums[j];
            if (currentPrefix == target) {
                return true;
            }
        }

        return false;
    }
}