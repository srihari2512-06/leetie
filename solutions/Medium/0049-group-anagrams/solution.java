// ──────────────────────────────────────────────────
// Problem  : 49. Group Anagrams
// Difficulty: Medium
// Tags     : Array, Hash Table, String, Sorting
// Link     : https://leetcode.com/problems/group-anagrams/
// Runtime  : 7 ms (beats 72%)
// Memory   : 49768000 (beats 47%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            
            map.get(sortedWord).add(word);
        }
        
        return new ArrayList<>(map.values());
    }
}