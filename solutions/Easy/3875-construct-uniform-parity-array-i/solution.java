// ──────────────────────────────────────────────────
// Problem  : 3875. Construct Uniform Parity Array I
// Difficulty: Easy
// Tags     : Array, Math
// Link     : https://leetcode.com/problems/construct-uniform-parity-array-i/
// Runtime  : 5 ms (beats 1%)
// Memory   : 45440000 (beats 14%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        boolean odd = true, even = true;

        for(int i=0; i<n; i++){
            if(nums1[i]%2==0){
                // check for odd
                boolean valid = false;
                for(int j=0; j<n; j++){
                    if(i!=j && Math.abs(nums1[i]-nums1[j])%2==1){
                        valid = true;
                    }
                }
                if(!valid) odd = false;
            }
            else {
                // check for even
                boolean valid = false;
                for(int j=0; j<n; j++){
                    if(i!=j && Math.abs(nums1[i]-nums1[j])%2==0){
                        valid = true;
                    }
                }
                if(!valid) even = false;
            }
        }

        return odd | even;
    }
}