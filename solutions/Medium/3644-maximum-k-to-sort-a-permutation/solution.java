// ──────────────────────────────────────────────────
// Problem  : 3644. Maximum K to Sort a Permutation
// Difficulty: Medium
// Tags     : Array, Bit Manipulation
// Link     : https://leetcode.com/problems/maximum-k-to-sort-a-permutation/
// Runtime  : 2 ms (beats 70%)
// Memory   : 110212000 (beats 81%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int sortPermutation(int[] nums) {
        int max = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i) max &= nums[i];
        }
        return max == Integer.MAX_VALUE ? 0 : max;
    }
}