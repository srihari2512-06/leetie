// ──────────────────────────────────────────────────
// Problem  : 1621. Number of Sets of K Non-Overlapping Line Segments
// Difficulty: Medium
// Tags     : Math, Dynamic Programming, Combinatorics, Prefix Sum
// Link     : https://leetcode.com/problems/number-of-sets-of-k-non-overlapping-line-segments/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42316000 (beats 83%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int numberOfSets(int n, int k) {
        int N = n + k - 1;
        int R = 2 * k;
     
        if (R > N) return 0;
        if (R > N - R) {
            R = N - R;
        }
        
        long num = 1;
        long den = 1;
        long MOD = 1_000_000_007;
        
        for (int i = 1; i <= R; i++) {
            num = (num * (N - i + 1)) % MOD;
            den = (den * i) % MOD;
        }
        
        return (int) ((num * modularInverse(den, MOD)) % MOD);
    }
    
    private long modularInverse(long n, long prime) {
        return power(n, prime - 2, prime);
    }
    
    private long power(long base, long exp, long prime) {
        long res = 1;
        base %= prime;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = (res * base) % prime;
            }
            base = (base * base) % prime;
            exp >>= 1;
        }
        return res;
    }
}