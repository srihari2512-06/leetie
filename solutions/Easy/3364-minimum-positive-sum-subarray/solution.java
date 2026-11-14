// ──────────────────────────────────────────────────
// Problem  : 3364. Minimum Positive Sum Subarray 
// Difficulty: Easy
// Tags     : Array, Sliding Window, Prefix Sum
// Link     : https://leetcode.com/problems/minimum-positive-sum-subarray/
// Runtime  : 51 ms (beats 6%)
// Memory   : 46316000 (beats 37%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minSum = Integer.MAX_VALUE, sum = 0;

        for(int i=0; i<nums.size(); i++){
            sum = 0;

            for(int j=i; j<nums.size(); j++){
                if(j-i+1 >= l && j-i+1 <= r){
                    sum = 0;

                    for(int num: nums.subList(i,j+1)){
                        sum += num;
                    }

                    if(sum<minSum && sum>0)
                        minSum = sum; 
                }
            }
        }

        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}