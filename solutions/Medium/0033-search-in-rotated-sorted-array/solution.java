// ──────────────────────────────────────────────────
// Problem  : 33. Search in Rotated Sorted Array
// Difficulty: Medium
// Tags     : Array, Binary Search
// Link     : https://leetcode.com/problems/search-in-rotated-sorted-array/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43368000 (beats 96%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}