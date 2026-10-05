// ──────────────────────────────────────────────────
// Problem  : 1665. Minimum Initial Energy to Finish Tasks
// Difficulty: Hard
// Tags     : Array, Greedy, Sorting
// Link     : https://leetcode.com/problems/minimum-initial-energy-to-finish-tasks/
// Runtime  : 2 ms (beats 96%)
// Memory   : 44212000 (beats 47%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));

        int curr = 0;
        int ans  = 0;
        for (int[] task : tasks) {
            int actual  = task[0];
            int minimum = task[1];
            if (curr < minimum) {
                ans  += (minimum - curr);
                curr  = minimum;
            }
            curr -= actual;
        }
        return ans;
    }
}