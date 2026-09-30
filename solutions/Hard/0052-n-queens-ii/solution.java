// ──────────────────────────────────────────────────
// Problem  : 52. N-Queens II
// Difficulty: Hard
// Tags     : Backtracking, Algorithm X
// Link     : https://leetcode.com/problems/n-queens-ii/
// Runtime  : 1 ms (beats 93%)
// Memory   : 42068000 (beats 57%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int totalNQueens(int n) {
        int allPositions = (1 << n) - 1;

        return backtrack(
            allPositions,
            0,
            0,
            0
        );
    }

    private int backtrack(
            int allPositions,
            int columns,
            int diagonal1,
            int diagonal2) {

        // All columns are occupied
        if (columns == allPositions) {
            return 1;
        }

        // Find all safe positions
        int available = allPositions
                & ~(columns | diagonal1 | diagonal2);

        int count = 0;

        while (available != 0) {
            // Get the rightmost available position
            int position = available & -available;

            // Remove this position
            available -= position;

            // Place queen and move to next row
            count += backtrack(
                allPositions,
                columns | position,
                (diagonal1 | position) << 1,
                (diagonal2 | position) >> 1
            );
        }

        return count;
    }
}