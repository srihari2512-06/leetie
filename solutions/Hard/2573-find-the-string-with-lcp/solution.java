// ──────────────────────────────────────────────────
// Problem  : 2573. Find the String with LCP
// Difficulty: Hard
// Tags     : Array, String, Dynamic Programming, Greedy, Union-Find, Matrix
// Link     : https://leetcode.com/problems/find-the-string-with-lcp/
// Runtime  : 5 ms (beats 100%)
// Memory   : 172340000 (beats 64%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String findTheString(int[][] lcp) {
        int n = lcp.length;
        char[] res = new char[n];
        char cur = 'a';

        for (int i = 0; i < n; i++) {
            if (res[i] == 0) {
                if (cur > 'z') return "";
                for (int j = i; j < n; j++) {
                    if (lcp[i][j] > 0) {
                        res[j] = cur;
                    }
                }
                cur++;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int expected = 0;
                if (res[i] == res[j]) {
                    expected = 1 + (i + 1 < n && j + 1 < n ? lcp[i + 1][j + 1] : 0);
                }
                if (lcp[i][j] != expected) {
                    return "";
                }
            }
        }

        return new String(res);
    }
}