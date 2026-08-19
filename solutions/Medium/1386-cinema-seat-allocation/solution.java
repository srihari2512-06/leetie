// ──────────────────────────────────────────────────
// Problem  : 1386. Cinema Seat Allocation
// Difficulty: Medium
// Tags     : Array, Hash Table, Greedy, Bit Manipulation
// Link     : https://leetcode.com/problems/cinema-seat-allocation/
// Runtime  : 18 ms (beats 82%)
// Memory   : 51072000 (beats 83%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int col = seat[1];
            map.put(row, map.getOrDefault(row, 0) | (1 << (col - 1)));
        }
        
        int ans = (n - map.size()) * 2;
        
        int left = 0b0111100000;  // seats 2-5
        int right = 0b0000011110; // seats 6-9
        int middle = 0b0001111000;// seats 4-7
        
        for (int mask : map.values()) {
            boolean allocated = false;
            if ((mask & left) == 0) {
                ans++;
                allocated = true;
            }
            if ((mask & right) == 0) {
                ans++;
                allocated = true;
            }
            if (!allocated && (mask & middle) == 0) {
                ans++;
            }
        }
        
        return ans;
    }
}