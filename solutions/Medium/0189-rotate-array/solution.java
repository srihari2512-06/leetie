// ──────────────────────────────────────────────────
// Problem  : 189. Rotate Array
// Difficulty: Medium
// Tags     : Array, Math, Two Pointers
// Link     : https://leetcode.com/problems/rotate-array/
// Runtime  : 5 ms (beats 9%)
// Memory   : 268320000 (beats 10%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums , 0 , n-1);
        reverse(nums , 0 , k-1);
        reverse(nums , k , n-1);
    }
    public void reverse(int[] nums , int left , int right){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}