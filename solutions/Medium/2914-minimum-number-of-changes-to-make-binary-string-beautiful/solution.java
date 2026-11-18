// ──────────────────────────────────────────────────
// Problem  : 2914. Minimum Number of Changes to Make Binary String Beautiful
// Difficulty: Medium
// Tags     : String
// Link     : https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful/
// Runtime  : 3 ms (beats 98%)
// Memory   : 45864000 (beats 93%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int minChanges(String s) {
        int c =0;
        int x = s.length();
        for(int i=0;i<x;i+=2){
            if(s.charAt(i)!=s.charAt(i+1)){
                c++;
            }
        }
        return c;
    }
}