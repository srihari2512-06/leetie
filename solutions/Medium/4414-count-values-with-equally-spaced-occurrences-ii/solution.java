// ──────────────────────────────────────────────────
// Problem  : 4414. Count Values With Equally Spaced Occurrences II
// Difficulty: Medium
// Tags     : N/A
// Link     : https://leetcode.com/problems/count-values-with-equally-spaced-occurrences-ii/
// Runtime  : 93 ms (beats 100%)
// Memory   : 246832000 (beats 100%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
        }
        int count  = 0;
        for(List<Integer>indices : map.values()){
            if(indices.size()<3){
                continue;
            }
            int diff = indices.get(1)-indices.get(0);
            boolean isequal = true;
            for(int i=2;i<indices.size();i++){
                if(indices.get(i)-indices.get(i-1)!=diff){
                    isequal = false;
                    break;
                }
            }
            if(isequal){
                count++;
            }
        }
        return count;
    }
}
[1,8,1,5,1,5,8,5]
[8,8,8,8]
[8,6,6,8,8]

[1,8,1,5,1,5,8,5]
[8,8,8,8]
[8,6,6,8,8]
2
1
0