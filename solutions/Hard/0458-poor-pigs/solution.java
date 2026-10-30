// ──────────────────────────────────────────────────
// Problem  : 458. Poor Pigs
// Difficulty: Hard
// Tags     : Math, Dynamic Programming, Combinatorics
// Link     : https://leetcode.com/problems/poor-pigs/
// Runtime  : 0 ms (beats 100%)
// Memory   : 41308000 (beats 98%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution
{
    public int poorPigs(int buckets, int tdie, int ttest)
    {
        int test = ttest/tdie;
        int i=0;
        while(Math.pow(test+1,i)< buckets)
        {
            i++;
        }
        return i;
    }
}