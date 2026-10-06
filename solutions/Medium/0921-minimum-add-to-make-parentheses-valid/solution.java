// ──────────────────────────────────────────────────
// Problem  : 921. Minimum Add to Make Parentheses Valid
// Difficulty: Medium
// Tags     : String, Stack, Greedy, Bracket Sequences
// Link     : https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42872000 (beats 57%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        int res = 0;
        for(char c:s.toCharArray()){
            if(c=='('){
                count++;
            }else{
                if(count>0){
                    count--;
                }else{
                    res++;
                }
            }
        }
        return res+count;
    }
}