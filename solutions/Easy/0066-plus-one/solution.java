// ──────────────────────────────────────────────────
// Problem  : 66. Plus One
// Difficulty: Easy
// Tags     : Array, Math
// Link     : https://leetcode.com/problems/plus-one/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43080000 (beats 95%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] != 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }   
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}