// ──────────────────────────────────────────────────
// Problem  : 940. Distinct Subsequences II
// Difficulty: Hard
// Tags     : String, Dynamic Programming
// Link     : https://leetcode.com/problems/distinct-subsequences-ii/
// Runtime  : 2 ms (beats 100%)
// Memory   : 43260000 (beats 70%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int distinctSubseqII(String s) {
        final long MOD = 1000000007L;
        
        long dp = 1;
        long[] last = new long[26];
        
        for (char c : s.toCharArray()) {
            int index = c - 'a';
            
            long oldDp = dp;
            
            dp = (2 * dp - last[index] + MOD) % MOD;
            
            last[index] = oldDp;
        }
        
        return (int)((dp - 1 + MOD) % MOD);
    }
}