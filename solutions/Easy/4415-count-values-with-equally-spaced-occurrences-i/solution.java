// ──────────────────────────────────────────────────
// Problem  : 4415. Count Values With Equally Spaced Occurrences I
// Difficulty: Easy
// Tags     : N/A
// Link     : https://leetcode.com/problems/count-values-with-equally-spaced-occurrences-i/
// Runtime  : 5 ms (beats 100%)
// Memory   : 46764000 (beats 100%)
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
        int count = 0;
        for(List<Integer> indices : map.values()){
            if(indices.size()==3){
                int a = indices.get(0);
                int b = indices.get(1);
                int c = indices.get(2);
                if(b-a==c-b){
                    count++;
                }
            }
        }
        return count;
    }
}
[1,8,1,5,1,5,8,5]
[8,8,8,8]
[8,6,6,8,8]