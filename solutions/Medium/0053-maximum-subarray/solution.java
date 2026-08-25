// ──────────────────────────────────────────────────
// Problem  : 53. Maximum Subarray
// Difficulty: Medium
// Tags     : Array, Divide and Conquer, Dynamic Programming
// Link     : https://leetcode.com/problems/maximum-subarray/
// Runtime  : 1 ms (beats 100%)
// Memory   : 80696000 (beats 8%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int currentsum = nums[0];
        for(int i=1 ; i<nums.length ; i++){
            currentsum = Math.max(nums[i],currentsum+nums[i]);
            maxsum = Math.max(currentsum , maxsum );
        }
        return maxsum;
    }
}