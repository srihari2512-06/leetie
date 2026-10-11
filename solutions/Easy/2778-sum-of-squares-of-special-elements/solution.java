// ──────────────────────────────────────────────────
// Problem  : 2778. Sum of Squares of Special Elements 
// Difficulty: Easy
// Tags     : Array, Enumeration
// Link     : https://leetcode.com/problems/sum-of-squares-of-special-elements/
// Runtime  : 1 ms (beats 100%)
// Memory   : 46516000 (beats 15%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int ans =0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                ans+=nums[i-1]*nums[i-1];
            }
        }
        return ans;
    }
}