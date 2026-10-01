// ──────────────────────────────────────────────────
// Problem  : 54. Spiral Matrix
// Difficulty: Medium
// Tags     : Array, Matrix, Simulation
// Link     : https://leetcode.com/problems/spiral-matrix/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43120000 (beats 25%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        List<Integer> spiral = new ArrayList<>();

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                spiral.add(matrix[top][i]);
            top++;

            for (int j = top; j <= bottom; j++)
                spiral.add(matrix[j][right]);
            right--;

            if (top <= bottom) {
                for (int k = right; k >= left; k--)
                    spiral.add(matrix[bottom][k]);
                bottom--;
            }

            if (left <= right) {
                for (int l = bottom; l >= top; l--)
                    spiral.add(matrix[l][left]);
                left++;
            }
        }

        return spiral;
    }
}