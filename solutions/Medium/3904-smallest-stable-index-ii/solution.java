// ──────────────────────────────────────────────────
// Problem  : 3904. Smallest Stable Index II
// Difficulty: Medium
// Tags     : Array, Prefix Sum
// Link     : https://leetcode.com/problems/smallest-stable-index-ii/
// Runtime  : 6 ms (beats 23%)
// Memory   : 127032000 (beats 55%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int result = Integer.MAX_VALUE;

        int max = Integer.MIN_VALUE;
        int[] preMax = new int[n];

        for(int i = 0; i < n; i++){
            max = Math.max(max,nums[i]);
            preMax[i] = max;
        }

        int min = Integer.MAX_VALUE;
        int[] sufMin = new int[n];

        for(int i = n-1; i >= 0; i--){
            min = Math.min(min,nums[i]);
            sufMin[i] = min;
        }

        for(int i = 0; i < n; i++){
            if(preMax[i] - sufMin[i] <= k)
            result = Math.min(result,i);
        }

         if(result == Integer.MAX_VALUE)
        return -1;
        else
        return result;
    }
}