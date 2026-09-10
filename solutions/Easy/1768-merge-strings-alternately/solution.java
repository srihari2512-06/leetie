// ──────────────────────────────────────────────────
// Problem  : 1768. Merge Strings Alternately
// Difficulty: Easy
// Tags     : Two Pointers, String
// Link     : https://leetcode.com/problems/merge-strings-alternately/
// Runtime  : 1 ms (beats 96%)
// Memory   : 43264000 (beats 35%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i<word1.length() || i<word2.length()){
            if(i<word1.length()){
                sb.append(word1.charAt(i));
            }
            if(i<word2.length()){
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}