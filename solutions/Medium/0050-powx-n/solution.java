// ──────────────────────────────────────────────────
// Problem  : 50. Pow(x, n)
// Difficulty: Medium
// Tags     : Math, Recursion
// Link     : https://leetcode.com/problems/powx-n/
// Runtime  : 0 ms (beats 100%)
// Memory   : 47728000 (beats 70%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
     public double myPow(double x, int n) {
        return power(x, (long) n);
    }

    private double power(double x, long n) {

        if (n == 0) {
            return 1.0;
        }

        if (n < 0) {
            return 1.0 / power(x, -n);
        }

        double half = power(x, n / 2);
        double square = half * half;

        if (n % 2 == 0) {
            return square;
        }

        return x * square;
    }
}