// ──────────────────────────────────────────────────
// Problem  : 69. Sqrt(x)
// Difficulty: Easy
// Tags     : Math, Binary Search, Newton's Method
// Link     : https://leetcode.com/problems/sqrtx/
// Runtime  : 1 ms (beats 100%)
// Memory   : 42788000 (beats 24%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int first = 1, last = x;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid > x / mid) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return last;
    }
}