// ──────────────────────────────────────────────────
// Problem  : 32. Longest Valid Parentheses
// Difficulty: Hard
// Tags     : String, Dynamic Programming, Stack, Bracket Sequences
// Link     : https://leetcode.com/problems/longest-valid-parentheses/
// Runtime  : 5 ms (beats 75%)
// Memory   : 46480000 (beats 56%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // base index
        int maxLength = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '(') {
                stack.push(i);
            } else {
                stack.pop();

                if(stack.isEmpty()) {
                    stack.push(i); // reset base
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }
}