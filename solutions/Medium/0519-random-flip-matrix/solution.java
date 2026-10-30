// ──────────────────────────────────────────────────
// Problem  : 519. Random Flip Matrix
// Difficulty: Medium
// Tags     : Hash Table, Math, Reservoir Sampling, Randomized
// Link     : https://leetcode.com/problems/random-flip-matrix/
// Runtime  : 24 ms (beats 71%)
// Memory   : 46600000 (beats 99%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    int i=0,j=0;
     int m=0;int n=0;

    public Solution(int m, int n) {
        this.m=m;
        this.n=n;
    }
    
    public int[] flip() {
        j++;
        if(j==n){
            j=0;
            i++;
        }
        if(i==m){
            i=0;
            j=0;
        }

             
        return new int[]{i,j};
        
    }
    
    public void reset() {
      
        
        
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(m, n);
 * int[] param_1 = obj.flip();
 * obj.reset();
 */