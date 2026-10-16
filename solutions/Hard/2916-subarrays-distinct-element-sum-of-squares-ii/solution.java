// ──────────────────────────────────────────────────
// Problem  : 2916. Subarrays Distinct Element Sum of Squares II
// Difficulty: Hard
// Tags     : Array, Hash Table, Binary Indexed Tree, Segment Tree
// Link     : https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-ii/
// Runtime  : 38 ms (beats 96%)
// Memory   : 104428000 (beats 46%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int sumCounts(int[] nums) {
        final long MOD = 1_000_000_007;
        int n = nums.length;
        long[] cnt = new long[n + 1], tot = new long[n + 1];  
        Map<Integer, Integer> last = new HashMap<>();
        long ans = 0;
        for (int r = 0; r < n; r++) {
            int p = last.getOrDefault(nums[r], -1);
            long c = 0, s = 0;
            for (int i = n - p - 1; i > 0; i -= i & -i) {  
                c += cnt[i];
                s += tot[i];
            }
            long gain = (long) (r - p) * (r - p) - 2 * (s - p * c); 
            ans = (ans + (n - r) * gain) % MOD;
            for (int i = n - p; i <= n; i += i & -i) {  
                cnt[i]++;
                tot[i] += p;
            }
            last.put(nums[r], r);
        }
        return (int) ans;
    }
}