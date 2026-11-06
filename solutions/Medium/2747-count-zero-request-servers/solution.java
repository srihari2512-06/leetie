// ──────────────────────────────────────────────────
// Problem  : 2747. Count Zero Request Servers
// Difficulty: Medium
// Tags     : Array, Hash Table, Sliding Window, Sorting
// Link     : https://leetcode.com/problems/count-zero-request-servers/
// Runtime  : 27 ms (beats 98%)
// Memory   : 135588000 (beats 76%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));

        Integer[] q = new Integer[queries.length];
        for (int i = 0; i < q.length; i++) q[i] = i;
        Arrays.sort(q, (a, b) -> Integer.compare(queries[a], queries[b]));

        int[] cnt = new int[n + 1], ans = new int[q.length];
        int l = 0, r = 0, active = 0;

        for (int i : q) {
            int t = queries[i];

            while (r < logs.length && logs[r][1] <= t)
                if (++cnt[logs[r++][0]] == 1) active++;

            while (l < r && logs[l][1] < t - x)
                if (--cnt[logs[l++][0]] == 0) active--;

            ans[i] = n - active;
        }

        return ans;
    }
}