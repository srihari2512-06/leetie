// ──────────────────────────────────────────────────
// Problem  : 368. Largest Divisible Subset
// Difficulty: Medium
// Tags     : Array, Math, Dynamic Programming, Sorting
// Link     : https://leetcode.com/problems/largest-divisible-subset/
// Runtime  : 17 ms (beats 65%)
// Memory   : 44352000 (beats 99%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {

    public List<Integer> largestDivisibleSubset(int[] nums) {
       
        Arrays.sort(nums);
        int n = nums.length;
       
        int[] groupSize = new int[n];
        int[] prevElement = new int[n];
        int maxIndex = 0;

        for(int i=0;i<n;i++) {
            groupSize[i] = 1;
            prevElement[i] = -1;
            for(int j=0;j<i;j++) {
                if(nums[i]%nums[j] == 0) {
                    if(groupSize[i] < 1 + groupSize[j]) {
                        groupSize[i] = 1 + groupSize[j];
                        prevElement[i] = j;
                    }
                }
            }
            if(groupSize[i] > groupSize[maxIndex]) {
                maxIndex = i;
            }
        }

        List<Integer> result = new ArrayList();
        while(maxIndex != -1) {
            result.add(0, nums[maxIndex]);
            maxIndex = prevElement[maxIndex];
        }

        return result;
    }
}