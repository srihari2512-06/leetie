// ──────────────────────────────────────────────────
// Problem  : 120. Triangle
// Difficulty: Medium
// Tags     : Array, Dynamic Programming
// Link     : https://leetcode.com/problems/triangle/
// Runtime  : 8 ms (beats 16%)
// Memory   : 45892000 (beats 29%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                int val = triangle.get(i).get(j) + 
                Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1));
                triangle.get(i).set(j, val);
            }
        }
        return triangle.get(0).get(0);
    }
}