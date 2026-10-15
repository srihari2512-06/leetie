// ──────────────────────────────────────────────────
// Problem  : 2913. Subarrays Distinct Element Sum of Squares I
// Difficulty: Easy
// Tags     : Array, Hash Table, Binary Indexed Tree, Segment Tree
// Link     : https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-i/
// Runtime  : 10 ms (beats 27%)
// Memory   : 46292000 (beats 83%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int res = 0;
        for (int i = 0; i < n; i++) {
            Set<Integer> s = new HashSet<>();
            for (int j = i; j < n; j++) {
                s.add(nums.get(j));
                int d = s.size();
                res += d * d;
            }
        }
        return res;
    }
}