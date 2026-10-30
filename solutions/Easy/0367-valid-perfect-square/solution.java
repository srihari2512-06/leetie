// ──────────────────────────────────────────────────
// Problem  : 367. Valid Perfect Square
// Difficulty: Easy
// Tags     : Math, Binary Search
// Link     : https://leetcode.com/problems/valid-perfect-square/
// Runtime  : 0 ms (beats 100%)
// Memory   : 41416000 (beats 95%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean isPerfectSquare(int num) {
        //Pointers for Binary Search
        int left = 1, right = num;
        //Binary Search
        while (left <= right) {
            int mid = (left + right)/2;
            // Necessary to prevent innacurate results for large numbers
            long midSquare = (long) mid * mid;
            //We found our perfect square, return true
            if (midSquare == num) return true;
            //We did not find our target, adjust the pointers
            else if (midSquare > num) right = mid - 1;
            else {
                left = mid + 1;
            }
        }
        //We went through the whole loop and never found a perfect square, so there is none
        return false;
    }
}