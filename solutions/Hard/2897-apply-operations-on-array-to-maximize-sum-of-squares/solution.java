// ──────────────────────────────────────────────────
// Problem  : 2897. Apply Operations on Array to Maximize Sum of Squares
// Difficulty: Hard
// Tags     : Array, Hash Table, Greedy, Bit Manipulation
// Link     : https://leetcode.com/problems/apply-operations-on-array-to-maximize-sum-of-squares/
// Runtime  : 65 ms (beats 33%)
// Memory   : 80484000 (beats 59%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxSum(List<Integer> nums, int k) {
        final long MOD = 1_000_000_007L;
        int[] bits = new int[31];

        for (int x : nums)
            for (int b = 0; b < 31; b++)
                if ((x & (1 << b)) != 0)
                    bits[b]++;

        long ans = 0;

        while (k-- > 0) {
            long x = 0;

            for (int b = 0; b < 31; b++)
                if (bits[b] > 0) {
                    x |= 1L << b;
                    bits[b]--;
                }

            ans = (ans + x * x) % MOD;
        }

        return (int) ans;
    }
}