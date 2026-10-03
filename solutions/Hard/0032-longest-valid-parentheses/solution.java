// ──────────────────────────────────────────────────
// Problem  : 32. Longest Valid Parentheses
// Difficulty: Hard
// Tags     : String, Dynamic Programming, Stack, Bracket Sequences
// Link     : https://leetcode.com/problems/longest-valid-parentheses/
// Runtime  : 5 ms (beats 75%)
// Memory   : 46412000 (beats 56%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max_len = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    max_len = Math.max(max_len, i - stack.peek());
                }
            }
        }

        return max_len;        
    }
}