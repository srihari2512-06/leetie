// ──────────────────────────────────────────────────
// Problem  : 4416. Cyclically Shift Rows and Columns
// Difficulty: Easy
// Tags     : N/A
// Link     : https://leetcode.com/problems/cyclically-shift-rows-and-columns/
// Runtime  : 1 ms (beats 100%)
// Memory   : 47316000 (beats 50%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int[][] temp = new int[n][n];
        int[][] result = new int[n][n];

        for (int r = 0; r < n; r++) {
            int k = rowShift[r];
            for (int c = 0; c < n; c++) {
                temp[r][(c - k + n) % n] = grid[r][c];
            }
        }

        for (int c = 0; c < n; c++) {
            int k = colShift[c];
            for (int r = 0; r < n; r++) {
                result[(r - k + n) % n][c] = temp[r][c];
            }
        }

        return result;
    }
}
2
[[1,2],[3,4]]
[1,0]
[0,1]
3
[[1,2,3],[4,5,6],[7,8,9]]
[1,2,0]
[2,2,1]
[[2,4],[3,1]]
[[7,8,5],[2,3,9],[6,4,1]]