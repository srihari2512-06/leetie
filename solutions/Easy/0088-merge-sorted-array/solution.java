// ──────────────────────────────────────────────────
// Problem  : 88. Merge Sorted Array
// Difficulty: Easy
// Tags     : Array, Two Pointers, Sorting
// Link     : https://leetcode.com/problems/merge-sorted-array/
// Runtime  : 4 ms (beats 15%)
// Memory   : 44116000 (beats 8%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0,j=m;i<n;i++) {
            nums1[j] = nums2[i];
            j++;
        }
        Arrays.sort(nums1);
    }
}