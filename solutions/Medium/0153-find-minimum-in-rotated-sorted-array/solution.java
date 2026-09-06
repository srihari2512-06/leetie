// ──────────────────────────────────────────────────
// Problem  : 153. Find Minimum in Rotated Sorted Array
// Difficulty: Medium
// Tags     : Array, Binary Search
// Link     : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43964000 (beats 20%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return nums[left];        
    }
}