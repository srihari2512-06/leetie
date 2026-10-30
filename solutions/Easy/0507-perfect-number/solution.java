// ──────────────────────────────────────────────────
// Problem  : 507. Perfect Number
// Difficulty: Easy
// Tags     : Math
// Link     : https://leetcode.com/problems/perfect-number/
// Runtime  : 2105 ms (beats 31%)
// Memory   : 41184000 (beats 99%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
}