// ──────────────────────────────────────────────────
// Problem  : 3120. Count the Number of Special Characters I
// Difficulty: Easy
// Tags     : Hash Table, String
// Link     : https://leetcode.com/problems/count-the-number-of-special-characters-i/
// Runtime  : 3 ms (beats 24%)
// Memory   : 43504000 (beats 76%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int numberOfSpecialChars(String word) {
        
        HashSet<Character> set = new HashSet<>();

        for(char ch : word.toCharArray()) {
            set.add(ch);
        }

        int count = 0;

        for(char ch = 'a'; ch <= 'z'; ch++) {

            if(set.contains(ch) && set.contains((char)(ch - 'a' + 'A'))) {
                count++;
            }
        }

        return count;
    }
}