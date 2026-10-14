// ──────────────────────────────────────────────────
// Problem  : 3723. Maximize Sum of Squares of Digits
// Difficulty: Medium
// Tags     : Math, Greedy
// Link     : https://leetcode.com/problems/maximize-sum-of-squares-of-digits/
// Runtime  : 82 ms (beats 56%)
// Memory   : 47532000 (beats 94%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder s = new StringBuilder();
        while(num-->0){
            s.append((char)(Math.min(9,sum)+'0'));
            sum-=Math.min(9,sum);
        }
        return sum>0?"":s.toString();
    }
}