// ──────────────────────────────────────────────────
// Problem  : 2525. Categorize Box According to Criteria
// Difficulty: Easy
// Tags     : Math
// Link     : https://leetcode.com/problems/categorize-box-according-to-criteria/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42660000 (beats 25%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long volume = (long) length * width * height;

        boolean isBulky = length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1000000000L;
        boolean isHeavy = mass >= 100;

        if (isBulky && isHeavy) return "Both";
        if (isBulky) return "Bulky";
        if (isHeavy) return "Heavy";
        return "Neither";
    }
}