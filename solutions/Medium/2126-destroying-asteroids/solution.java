// ──────────────────────────────────────────────────
// Problem  : 2126. Destroying Asteroids
// Difficulty: Medium
// Tags     : Array, Greedy, Sorting
// Link     : https://leetcode.com/problems/destroying-asteroids/
// Runtime  : 27 ms (beats 30%)
// Memory   : 106804000 (beats 88%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long curMass=mass;
        for(int val:asteroids){
            if(val>curMass)return false;
            curMass+=val;
        }
        return true;
    }
}