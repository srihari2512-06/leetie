// ──────────────────────────────────────────────────
// Problem  : 2948. Make Lexicographically Smallest Array by Swapping Elements
// Difficulty: Medium
// Tags     : Array, Union-Find, Sorting
// Link     : https://leetcode.com/problems/make-lexicographically-smallest-array-by-swapping-elements/
// Runtime  : 71 ms (beats 92%)
// Memory   : 155720000 (beats 67%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.Arrays;

class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        int[][] paired = new int[n][2];
        for (int i = 0; i < n; i++) {
            paired[i][0] = nums[i];
            paired[i][1] = i;
        }

        Arrays.sort(paired, (a, b) -> Integer.compare(a[0], b[0]));

        int[] result = new int[n];
        int i = 0;
        while (i < n) {
            int j = i;
            while (j + 1 < n && paired[j + 1][0] - paired[j][0] <= limit) {
                j++;
            }

            int[] indices = new int[j - i + 1];
            for (int k = i; k <= j; k++) {
                indices[k - i] = paired[k][1];
            }
            Arrays.sort(indices);

            for (int k = i; k <= j; k++) {
                result[indices[k - i]] = paired[k][0];
            }

            i = j + 1;
        }

        return result;
    }
}