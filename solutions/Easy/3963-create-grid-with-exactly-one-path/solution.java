// ──────────────────────────────────────────────────
// Problem  : 3963. Create Grid With Exactly One Path
// Difficulty: Easy
// Tags     : N/A
// Link     : https://leetcode.com/problems/create-grid-with-exactly-one-path/
// Runtime  : 3 ms (beats 57%)
// Memory   : 45896000 (beats 95%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];
        char[] row = new char[n];
        for (int j = 0; j < n; ++j) {
            row[j] = '#';
        }
        for (int i = 0; i < m; ++i) {
            grid[i] = new String(row);
        }
        char[] first = grid[0].toCharArray();
        for (int j = 0; j < n; ++j) {
            first[j] = '.';
        }
        grid[0] = new String(first);
        for (int i = 0; i < m; ++i) {
            char[] r = grid[i].toCharArray();
            r[n - 1] = '.';
            grid[i] = new String(r);
        }
        return grid;
    }
}