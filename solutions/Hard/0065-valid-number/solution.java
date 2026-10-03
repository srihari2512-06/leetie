// ──────────────────────────────────────────────────
// Problem  : 65. Valid Number
// Difficulty: Hard
// Tags     : String
// Link     : https://leetcode.com/problems/valid-number/
// Runtime  : 1 ms (beats 100%)
// Memory   : 44016000 (beats 35%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean isNumber(String s) {
        boolean isdot = false, ise = false, nums = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) nums = true;
            else if (c == '+' || c == '-') {
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') return false;
            } 
            else if (c == 'e' || c == 'E') {
                if (ise || !nums) return false;
                ise = true;
                nums = false;
            } 
            else if (c == '.') {
                if (isdot || ise) return false;
                isdot = true;
            } 
            else return false;
        }
        return nums;
    }
}