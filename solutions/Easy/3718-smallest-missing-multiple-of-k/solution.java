// ──────────────────────────────────────────────────
// Problem  : 3718. Smallest Missing Multiple of K
// Difficulty: Easy
// Tags     : Array, Hash Table
// Link     : https://leetcode.com/problems/smallest-missing-multiple-of-k/
// Runtime  : 2 ms (beats 68%)
// Memory   : 45144000 (beats 67%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int target = k;
        while(set.contains(target)){
            target += k;
        }
        return target;
    }
}