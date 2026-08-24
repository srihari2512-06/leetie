// ──────────────────────────────────────────────────
// Problem  : 1872. Stone Game VIII
// Difficulty: Hard
// Tags     : Array, Math, Dynamic Programming, Minimax, Prefix Sum, Game Theory, Zero-Sum Game
// Link     : https://leetcode.com/problems/stone-game-viii/
// Runtime  : 3 ms (beats 100%)
// Memory   : 92240000 (beats 29%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int stoneGameVIII(int[] stones) {
        int n = stones.length;
        int[] prefix = new int[n];
        prefix[0] = stones[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + stones[i];
        }

        int maxDiff = prefix[n - 1];
        for (int i = n - 2; i >= 1; i--) {
            maxDiff = Math.max(maxDiff, prefix[i] - maxDiff);
        }

        return maxDiff;
    }
}