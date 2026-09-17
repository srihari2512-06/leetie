// ──────────────────────────────────────────────────
// Problem  : 1752. Check if Array Is Sorted and Rotated
// Difficulty: Easy
// Tags     : Array
// Link     : https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43376000 (beats 12%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                count++;
            }
        }
        return count<=1;
    }
}