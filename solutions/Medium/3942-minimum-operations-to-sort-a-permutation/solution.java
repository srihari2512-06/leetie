// ──────────────────────────────────────────────────
// Problem  : 3942. Minimum Operations to Sort a Permutation
// Difficulty: Medium
// Tags     : Array
// Link     : https://leetcode.com/problems/minimum-operations-to-sort-a-permutation/
// Runtime  : 6 ms (beats 15%)
// Memory   : 94664000 (beats 92%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ind_0 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) ind_0 = i;
        }
        
        int ans1 = Integer.MAX_VALUE;
        for (int i = ind_0; i < ind_0 + n - 1; i++) {
            if (nums[i % n] >= nums[(i + 1) % n]) {
                ans1 = -1;
                break;
            }
        }
        if (ans1 != -1)
            return Math.min(ind_0, 2 + n - ind_0);
        int ans2 = Integer.MAX_VALUE;
        for (int i = ind_0; i > ind_0 - n + 1; i--) {
            if (nums[((n + i) % n)] >= nums[((n + i - 1) % n)]) {
                ans2 = -1;
                break;
            }
        }
        if (ans2 != -1)
            return Math.min(n - ind_0, ind_0 + 2);
        
        return -1;
    }
}