// ──────────────────────────────────────────────────
// Problem  : 213. House Robber II
// Difficulty: Medium
// Tags     : Array, Dynamic Programming
// Link     : https://leetcode.com/problems/house-robber-ii/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42948000 (beats 23%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(getMax(nums, 0, nums.length - 2), getMax(nums, 1, nums.length - 1));        
    }

    private int getMax(int[] nums, int start, int end) {
        int prevRob = 0, maxRob = 0;

        for (int i = start; i <= end; i++) {
            int temp = Math.max(maxRob, prevRob + nums[i]);
            prevRob = maxRob;
            maxRob = temp;
        }

        return maxRob;
    }    
}