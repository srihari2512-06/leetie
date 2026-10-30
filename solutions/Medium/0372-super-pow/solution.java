// ──────────────────────────────────────────────────
// Problem  : 372. Super Pow
// Difficulty: Medium
// Tags     : Math, Divide and Conquer, Euler's Totient Function, Euler's Theorem
// Link     : https://leetcode.com/problems/super-pow/
// Runtime  : 2 ms (beats 86%)
// Memory   : 45924000 (beats 84%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {

    private int pow(int x, int n, int MOD) {
        int ans = 1;
        x %= MOD;

        while (n > 0) {
            if ((n & 1) == 1) {
                ans = (ans * x) % MOD;
            }

            x = (x * x) % MOD;
            n >>= 1;
        }

        return ans;
    }

    public int superPow(int a, int[] b) {

        if (a == 1) {
            return 1;
        }

        int num = 0;

        for (int val : b) {
            num = (num * 10 + val) % 1140;
        }

        // b is positive, so remainder 0 means
        // the exponent is a positive multiple of 1140.
        if (num == 0) {
            num = 1140;
        }

        return pow(a, num, 1337);
    }
}