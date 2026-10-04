// ──────────────────────────────────────────────────
// Problem  : 678. Valid Parenthesis String
// Difficulty: Medium
// Tags     : String, Dynamic Programming, Stack, Greedy, Bracket Sequences
// Link     : https://leetcode.com/problems/valid-parenthesis-string/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42884000 (beats 34%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                low++;
                high++;
            }
            else if (c == ')') {
                low = Math.max(0, low - 1);
                high--;
            }
            else {
                low = Math.max(0, low - 1);
                high++;
            }

            if (high < 0)
                return false;
        }

        return low == 0;
    }
}