// ──────────────────────────────────────────────────
// Problem  : 441. Arranging Coins
// Difficulty: Easy
// Tags     : Math, Binary Search
// Link     : https://leetcode.com/problems/arranging-coins/
// Runtime  : 3 ms (beats 43%)
// Memory   : 41812000 (beats 99%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int arrangeCoins(int n) {
        long low = 0;
        long high = n;
        int rows = 0;

        while(low <= high){
            long mid = low + (high - low)/2;
            long coins = mid*(mid+1)/2;
            if(coins <= n){
                rows = (int) mid;
            }
            if(coins > n) high = mid - 1;
            else low = mid + 1;
        }
        return rows;
    }
}