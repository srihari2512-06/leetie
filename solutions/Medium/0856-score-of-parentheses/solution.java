// ──────────────────────────────────────────────────
// Problem  : 856. Score of Parentheses
// Difficulty: Medium
// Tags     : String, Stack, Bracket Sequences
// Link     : https://leetcode.com/problems/score-of-parentheses/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42572000 (beats 83%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int scoreOfParentheses(String s) {
        int totalScore = 0;
        int depth = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                depth++;
            } else {
                depth--;
                if (s.charAt(i - 1) == '(') {
                    totalScore += (1 << depth);
                }
            }
        }
        
        return totalScore;
    }
}