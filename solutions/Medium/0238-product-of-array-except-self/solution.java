// ──────────────────────────────────────────────────
// Problem  : 238. Product of Array Except Self
// Difficulty: Medium
// Tags     : Array, Prefix Sum
// Link     : https://leetcode.com/problems/product-of-array-except-self/
// Runtime  : 2 ms (beats 94%)
// Memory   : 71892000 (beats 60%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int prefix = 1;
        for(int i=0;i<n;i++){
            ans[i] = prefix;
            prefix = prefix*nums[i];
        }
        int sufix = 1;
        for(int i=n-1;i>=0;i--){
            ans[i]*= sufix;
            sufix *= nums[i]; 
        }
        return ans;
    }
}