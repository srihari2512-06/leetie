// ──────────────────────────────────────────────────
// Problem  : 3483. Unique 3-Digit Even Numbers
// Difficulty: Easy
// Tags     : Array, Hash Table, Recursion, Enumeration
// Link     : https://leetcode.com/problems/unique-3-digit-even-numbers/
// Runtime  : 5 ms (beats 83%)
// Memory   : 46056000 (beats 73%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> seen = new HashSet<>();
        int n = digits.length;

        for (int h = 0; h < n; h++) {
            if (digits[h] == 0) continue;

            for (int t = 0; t < n; t++) {
                if (t == h) continue;

                for (int u = 0; u < n; u++) {
                    if (u == h || u == t) continue;

                    if (digits[u] % 2 != 0) continue;

                    int num = digits[h] * 100 + digits[t] * 10 + digits[u];
                    seen.add(num);
                }
            }
        }

        return seen.size();
    }
}