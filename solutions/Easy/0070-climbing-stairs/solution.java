// ──────────────────────────────────────────────────
// Problem  : 70. Climbing Stairs
// Difficulty: Easy
// Tags     : Math, Dynamic Programming, Memoization
// Link     : https://leetcode.com/problems/climbing-stairs/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42092000 (beats 55%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return climbStairs(n, memo);
    }
    
    private int climbStairs(int n, Map<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (!memo.containsKey(n)) {
            memo.put(n, climbStairs(n-1, memo) + climbStairs(n-2, memo));
        }
        return memo.get(n);
    }
}