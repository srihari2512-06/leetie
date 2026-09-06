// ──────────────────────────────────────────────────
// Problem  : 167. Two Sum II - Input Array Is Sorted
// Difficulty: Medium
// Tags     : Array, Two Pointers, Binary Search
// Link     : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// Runtime  : 2 ms (beats 96%)
// Memory   : 48396000 (beats 61%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int total = numbers[left] + numbers[right];

            if (total == target) {
                return new int[]{left + 1, right + 1};
            } else if (total > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1}; // If no solution is found        
    }
}