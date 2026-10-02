// ──────────────────────────────────────────────────
// Problem  : 58. Length of Last Word
// Difficulty: Easy
// Tags     : String
// Link     : https://leetcode.com/problems/length-of-last-word/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42900000 (beats 83%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int i = n - 1;
        int len = 0;

        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }
        while(i >= 0 && s.charAt(i) != ' '){
            len++;
            i--;
        }
        return len;
    }
}