// ──────────────────────────────────────────────────
// Problem  : 1021. Remove Outermost Parentheses
// Difficulty: Easy
// Tags     : String, Stack, Bracket Sequences
// Link     : https://leetcode.com/problems/remove-outermost-parentheses/
// Runtime  : 2 ms (beats 100%)
// Memory   : 43820000 (beats 23%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String removeOuterParentheses(String s) {
        int len = s.length();
        if(len<=2) return "";
        char[] c = s.toCharArray();
        StringBuilder newString = new StringBuilder();
        int open =1;
        int openLeft = 0;
        for(int i=1;i<len;i++){
            if(c[i]=='('){
                open++;
                if(open>1) newString.append('(');
            }
            else{
                if(open>1) newString.append(')');
                open--;
            }
        }
        return newString.toString();
    }
}