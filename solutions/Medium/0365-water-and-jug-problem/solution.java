// ──────────────────────────────────────────────────
// Problem  : 365. Water and Jug Problem
// Difficulty: Medium
// Tags     : Math, Depth-First Search, Breadth-First Search, Bézout's Lemma, Euclidean Algorithm, Greatest Common Divisor, Extended Euclidean Algorithm
// Link     : https://leetcode.com/problems/water-and-jug-problem/
// Runtime  : 0 ms (beats 100%)
// Memory   : 41512000 (beats 91%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if (target > x + y) {
            return false;
        }

        return target % gcd(x, y) == 0;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}