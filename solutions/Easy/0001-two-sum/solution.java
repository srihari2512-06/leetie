// ──────────────────────────────────────────────────
// Problem  : 1. Two Sum
// Difficulty: Easy
// Tags     : Array, Hash Table
// Link     : https://leetcode.com/problems/two-sum/
// Runtime  : 3 ms (beats 59%)
// Memory   : 47224000 (beats 24%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp = target - nums[i];
            if(map.containsKey(comp)){
                return new int[] {map.get(comp),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
}