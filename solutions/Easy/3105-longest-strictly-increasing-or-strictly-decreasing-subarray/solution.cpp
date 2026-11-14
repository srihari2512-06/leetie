// ──────────────────────────────────────────────────
// Problem  : 3105. Longest Strictly Increasing or Strictly Decreasing Subarray
// Difficulty: Easy
// Tags     : Array
// Link     : https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/
// Runtime  : 0 ms (beats 100%)
// Memory   : 27712000 (beats 58%)
// Language : cpp
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
public:
    int longestMonotonicSubarray(vector<int>& nums) {
        int n=nums.size(), i=0, ans=0;
        int inc=1, dec=1;
        if (n==1) return 1;
        for(i=1 ;i<n; i++){
            if (nums[i]>nums[i-1]) inc++, dec=1;
            else if (nums[i]<nums[i-1]) inc=1, dec++;
            else inc=dec=1;
            ans=max({ans, dec, inc});
        } 
        return ans;   
    }
};