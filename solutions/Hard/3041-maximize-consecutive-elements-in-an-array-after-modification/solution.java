// ──────────────────────────────────────────────────
// Problem  : 3041. Maximize Consecutive Elements in an Array After Modification
// Difficulty: Hard
// Tags     : Array, Dynamic Programming, Sorting
// Link     : https://leetcode.com/problems/maximize-consecutive-elements-in-an-array-after-modification/
// Runtime  : 121 ms (beats 6%)
// Memory   : 116388000 (beats 42%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
        public int maxSelectedElements(int[] A) {
        HashMap<Integer, Integer> dp = new HashMap<>();
        Arrays.sort(A);
        int res = 0;
        for (int a : A) {
            dp.put(a + 1, dp.getOrDefault(a, 0) + 1);
            dp.put(a, dp.getOrDefault(a - 1, 0) + 1);
            res = Math.max(res, Math.max(dp.get(a), dp.get(a + 1)));
        }
        return res;
    }
}