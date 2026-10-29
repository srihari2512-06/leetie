// ──────────────────────────────────────────────────
// Problem  : 140. Word Break II
// Difficulty: Hard
// Tags     : Array, Hash Table, String, Dynamic Programming, Backtracking, Trie, Memoization
// Link     : https://leetcode.com/problems/word-break-ii/
// Runtime  : 6 ms (beats 3%)
// Memory   : 41960000 (beats 100%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashSet<String> hs = new HashSet<>(wordDict);
        return wordBreakHelper(s, 0, hs);
    }

    private List<String> wordBreakHelper(String s, int start, HashSet<String> dict) {
        List<String> validSubstr = new ArrayList<>();

        if (start == s.length())
            validSubstr.add("");
        for (int end = start + 1; end <= s.length(); end++) {
            String prefix = s.substring(start, end);
            if (dict.contains(prefix)) {
                List<String> suffixes = wordBreakHelper(s, end, dict);
                for (String suffix : suffixes) {
                    validSubstr.add(prefix + (suffix.equals("") ? "" : " ") + suffix);
                }
            }
        }
        return validSubstr;
    }
}