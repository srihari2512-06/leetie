// ──────────────────────────────────────────────────
// Problem  : 278. First Bad Version
// Difficulty: Easy
// Tags     : Binary Search, Interactive
// Link     : https://leetcode.com/problems/first-bad-version/
// Runtime  : 27 ms (beats 5%)
// Memory   : 41924000 (beats 72%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low =0;
        int high = n;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(isBadVersion(mid)==true && isBadVersion(mid-1)==false) return mid;
            else if(isBadVersion(mid)==false) low=mid+1;
            else high = mid;
        }
        return -1;
    }
}