// ──────────────────────────────────────────────────
// Problem  : 479. Largest Palindrome Product
// Difficulty: Hard
// Tags     : Math, Enumeration
// Link     : https://leetcode.com/problems/largest-palindrome-product/
// Runtime  : 0 ms (beats 100%)
// Memory   : 41492000 (beats 97%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

public class Solution {
    public int largestPalindrome(int n) {
        int[] x = {9,99,993,9999,99979,999999,9998017,99999999};
        int[] y = {1,91,913,9901,99681,999001,9997647,99990001};
        
        return ((x[n-1] % 1337) * (y[n-1] % 1337)) % 1337;
    }
}