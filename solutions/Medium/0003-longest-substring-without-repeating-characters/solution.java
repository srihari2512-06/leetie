// ──────────────────────────────────────────────────
// Problem  : 3. Longest Substring Without Repeating Characters
// Difficulty: Medium
// Tags     : Hash Table, String, Sliding Window
// Link     : https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Runtime  : 0 ms (beats 0%)
// Memory   : 41988000 (beats 0%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> map = new HashSet<>();
        int left = 0;
        int maxlen = 0;
        for(int right =0;right<s.length();right++){
            while(map.contains(s.charAt(right))){
                map.remove(s.charAt(left));
                left++;
            }
            map.add(s.charAt(right));
            maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;


    }
}