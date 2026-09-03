// ──────────────────────────────────────────────────
// Problem  : 2525. Categorize Box According to Criteria
// Difficulty: Easy
// Tags     : Math
// Link     : https://leetcode.com/problems/categorize-box-according-to-criteria/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42648000 (beats 25%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean bulky = length >= 10000 || width >= 10000 || height >= 10000 || (long) length * width * height >= 1000000000L;
        boolean heavy = mass >= 100;

        if (bulky && heavy) {
            return "Both";
        }
        if (bulky) {
            return "Bulky";
        }
        if (heavy) {
            return "Heavy";
        }
        return "Neither";
    }
}