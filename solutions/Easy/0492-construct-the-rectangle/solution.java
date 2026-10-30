// ──────────────────────────────────────────────────
// Problem  : 492. Construct the Rectangle
// Difficulty: Easy
// Tags     : Math
// Link     : https://leetcode.com/problems/construct-the-rectangle/
// Runtime  : 0 ms (beats 100%)
// Memory   : 41852000 (beats 95%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] constructRectangle(int area) {

        int width = (int) Math.sqrt(area);

        while (area % width != 0) {
            width--;
        }

        return new int[] { area / width, width };
    }
}