// ──────────────────────────────────────────────────
// Problem  : 3727. Maximum Alternating Sum of Squares
// Difficulty: Medium
// Tags     : Array, Greedy, Sorting
// Link     : https://leetcode.com/problems/maximum-alternating-sum-of-squares/
// Runtime  : 35 ms (beats 39%)
// Memory   : 125728000 (beats 93%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                nums[i] = -1*nums[i];
            }
        }
        Arrays.sort(nums);
        long ns = 0;
        for(int i=0;i<n/2;i++){
            ns+=(long)(nums[i]*nums[i]);
        }
        long ps =0;
        for(int i=n/2;i<n;i++){
            ps+=(long) (nums[i]*nums[i]);
        }
        long ans = ps-ns;
        return ans;
    }
}