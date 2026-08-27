// ──────────────────────────────────────────────────
// Problem  : 514. Freedom Trail
// Difficulty: Hard
// Tags     : String, Dynamic Programming, Depth-First Search, Breadth-First Search
// Link     : https://leetcode.com/problems/freedom-trail/
// Runtime  : 128 ms (beats 9%)
// Memory   : 46312000 (beats 75%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int findRotateSteps(String ring, String key) {
        int n = ring.length();
        int m = key.length();
        
        int[] dp = new int[n];
        
        for (int i = m - 1; i >= 0; i--) {
            int[] nextDp = new int[n];
            char target = key.charAt(i);
            
            for (int r = 0; r < n; r++) {
                int minSteps = Integer.MAX_VALUE;
                for (int k = 0; k < n; k++) {
                    if (ring.charAt(k) == target) {
                        int diff = Math.abs(r - k);
                        int dist = Math.min(diff, n - diff);
                        minSteps = Math.min(minSteps, dist + 1 + dp[k]);
                    }
                }
                nextDp[r] = minSteps;
            }
            dp = nextDp;
        }
        
        return dp[0];
    }
}