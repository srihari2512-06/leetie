// ──────────────────────────────────────────────────
// Problem  : 1614. Maximum Nesting Depth of the Parentheses
// Difficulty: Easy
// Tags     : String, Stack, Bracket Sequences
// Link     : https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42516000 (beats 92%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxDepth(String s) {
        int x=0 , y=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') x++;
            else if(s.charAt(i)==')') x--;
            if(x>y) y=x;
        }
        return y;
    }
}