// ──────────────────────────────────────────────────
// Problem  : 2770. Maximum Number of Jumps to Reach the Last Index
// Difficulty: Medium
// Tags     : Array, Dynamic Programming
// Link     : https://leetcode.com/problems/maximum-number-of-jumps-to-reach-the-last-index/
// Runtime  : 15 ms (beats 65%)
// Memory   : 46848000 (beats 77%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maximumJumps(int[] nums, int target) {

        int[] dp = new int[nums.length];

        // -1 means unreachable
        Arrays.fill(dp, -1);

        // starting index
        dp[0] = 0;

        for (int i = 0; i < nums.length; i++) {

            // skip unreachable indices
            if (i > 0 && dp[i] <= 0) {
                continue;
            }

            for (int j = i + 1; j < nums.length; j++) {

                // valid jump condition
                if (Math.abs(nums[i] - nums[j]) <= Math.abs(target)) {

                    // maximize number of jumps
                    dp[j] = Math.max(dp[j], dp[i] + 1);
                }
            }
        }

        return dp[nums.length - 1];
    }
}