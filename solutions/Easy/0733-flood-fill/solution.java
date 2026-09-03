// ──────────────────────────────────────────────────
// Problem  : 733. Flood Fill
// Difficulty: Easy
// Tags     : Array, Depth-First Search, Breadth-First Search, Matrix
// Link     : https://leetcode.com/problems/flood-fill/
// Runtime  : 0 ms (beats 100%)
// Memory   : 46848000 (beats 43%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];

        // Base case: if target color is same as starting color, return directly
        if (originalColor == color) return image;

        dfs(image, sr, sc, originalColor, color);

        return image;
    }

    void dfs(int[][] image, int sr, int sc, int originalColor, int givenColor) {
        int m = image.length;
        int n = image[0].length;

        // Boundary checks and color match check
        if (sr < 0 || sr >= m || sc < 0 || sc >= n) return;
        if (image[sr][sc] != originalColor) return;

        // Update color
        image[sr][sc] = givenColor;

        // Recurse on adjacent pixels using originalColor
        dfs(image, sr + 1, sc, originalColor, givenColor);
        dfs(image, sr - 1, sc, originalColor, givenColor);
        dfs(image, sr, sc + 1, originalColor, givenColor);
        dfs(image, sr, sc - 1, originalColor, givenColor);
    }
}