// ──────────────────────────────────────────────────
// Problem  : 11. Container With Most Water
// Difficulty: Medium
// Tags     : Array, Two Pointers, Greedy
// Link     : https://leetcode.com/problems/container-with-most-water/
// Runtime  : 5 ms (beats 83%)
// Memory   : 77216000 (beats 69%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxarea = 0;
        while(left<right){
            maxarea = Math.max(maxarea , (right-left) * Math.min(height[left],height[right]));
            if(height[left]<height[right]){
                left++;
            }else{
                    right--;
            }
        }
        return maxarea;
    }
}