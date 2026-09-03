// ──────────────────────────────────────────────────
// Problem  : 2527. Find Xor-Beauty of Array
// Difficulty: Medium
// Tags     : Array, Math, Bit Manipulation
// Link     : https://leetcode.com/problems/find-xor-beauty-of-array/
// Runtime  : 1 ms (beats 96%)
// Memory   : 70888000 (beats 43%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int xorBeauty(int[] nums) {
        int res = 0;
        for(int num:nums){
            res^=num;
        }
        return res;
    }
}