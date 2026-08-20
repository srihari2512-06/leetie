// ──────────────────────────────────────────────────
// Problem  : 1288. Remove Covered Intervals
// Difficulty: Medium
// Tags     : Array, Sorting
// Link     : https://leetcode.com/problems/remove-covered-intervals/
// Runtime  : 6 ms (beats 92%)
// Memory   : 46468000 (beats 61%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });

        int count = 0;
        int maxEnd = 0;

        for (int[] interval : intervals) {
            if (interval[1] > maxEnd) {
                count++;
                maxEnd = interval[1];
            }
        }

        return count;
    }
}