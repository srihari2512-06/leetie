# ──────────────────────────────────────────────────
# Problem  : 1190. Reverse Substrings Between Each Pair of Parentheses
# Difficulty: Medium
# Tags     : String, Stack, Bracket Sequences
# Link     : https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/
# Runtime  : 0 ms (beats 100%)
# Memory   : 19384000 (beats 30%)
# Language : python3
# Copyright: (c) 2026 srihari2512-06. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def reverseParentheses(self, s: str) -> str:
        n = len(s)
        pair = [0] * n
        st = []
        for i in range(n):
            if s[i] == '(':
                st.append(i)
            elif s[i] == ')':
                j = st.pop()
                pair[i] = j
                pair[j] = i
        res = []
        i, dir = 0, 1
        while 0 <= i < n:
            if s[i] in '()':
                i = pair[i]
                dir = -dir
            else:
                res.append(s[i])
            i += dir
        return ''.join(res)