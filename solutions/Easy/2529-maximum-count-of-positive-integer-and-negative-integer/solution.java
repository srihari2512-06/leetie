// ──────────────────────────────────────────────────
// Problem  : 2529. Maximum Count of Positive Integer and Negative Integer
// Difficulty: Easy
// Tags     : Array, Binary Search, Counting
// Link     : https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
// Runtime  : 0 ms (beats 100%)
// Memory   : 47272000 (beats 5%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maximumCount(int[] nums) {
        int neg = binarySearch(nums, 0);
        int pos = nums.length - binarySearch(nums, 1);
        return Math.max(neg, pos);
    }

    private int binarySearch(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = nums.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}