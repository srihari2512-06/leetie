// ──────────────────────────────────────────────────
// Problem  : 1331. Rank Transform of an Array
// Difficulty: Easy
// Tags     : Array, Hash Table, Sorting
// Link     : https://leetcode.com/problems/rank-transform-of-an-array/
// Runtime  : 30 ms (beats 71%)
// Memory   : 69096000 (beats 96%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int m=0;
        for(int x:sorted){
            if(m==0||sorted[m-1]!=x){
                sorted[m++]=x;
            }
        }
        int[] unique = Arrays.copyOf(sorted,m);
        for(int i=0;i<arr.length;i++){
            arr[i]= Arrays.binarySearch(unique,arr[i])+1;
        }
        return arr;
    }
}