// ──────────────────────────────────────────────────
// Problem  : 0. Minimum Operations to Make Every Element Palindromic
// Difficulty: Medium
// Tags     : N/A
// Link     : https://leetcode.com/problems/minimum-operations-to-make-every-element-palindromic/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42732000 (beats 0%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public long minOperations(int[] nums) {
        int[] virelqunox = nums;
        long totalOps = 0;
        
        for (int x : virelqunox) {
            long minOps = Long.MAX_VALUE;
            int parity = x % 2;
            
            for (int diff = 0; diff <= 2000; diff += 2) {
                int targetDown = x - diff;
                if (targetDown > 0 && isPalindrome(targetDown)) {
                    minOps = Math.min(minOps, diff / 2);
                    break;
                }
                
                int targetUp = x + diff;
                if (isPalindrome(targetUp)) {
                    minOps = Math.min(minOps, diff / 2);
                    break;
                }
            }
            
            if (minOps == Long.MAX_VALUE) {
                int d = 0;
                while (true) {
                    int targetDown = x - d;
                    if (targetDown > 0 && targetDown % 2 == parity && isPalindrome(targetDown)) {
                        minOps = Math.min(minOps, d / 2);
                        break;
                    }
                    int targetUp = x + d;
                    if (targetUp % 2 == parity && isPalindrome(targetUp)) {
                        minOps = Math.min(minOps, d / 2);
                        break;
                    }
                    d += 2;
                }
            }
            
            totalOps += minOps;
        }
        
        return totalOps;
    }
    
    private boolean isPalindrome(int val) {
        int orig = val;
        int rev = 0;
        while (val > 0) {
            rev = rev * 10 + val % 10;
            val /= 10;
        }
        return orig == rev;
    }
}
[10,12,14,16]
[9,10,11,10]
[125]
9
2
2