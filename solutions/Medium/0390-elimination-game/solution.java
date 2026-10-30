// ──────────────────────────────────────────────────
// Problem  : 390. Elimination Game
// Difficulty: Medium
// Tags     : Math, Recursion
// Link     : https://leetcode.com/problems/elimination-game/
// Runtime  : 5 ms (beats 8%)
// Memory   : 43224000 (beats 65%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int lastRemaining(int n) {
        int head=1;
        int rem = n;
        int left=1;
        int step=1;
        while(rem>1){
            if(left==1 || rem%2!=0){
                head+=step;
                if(left==1)left=-1;
                else left=1;
            }
            else{
                left=1;
            }
            step*=2;
            rem/=2;
        }

        return head;
    }
}