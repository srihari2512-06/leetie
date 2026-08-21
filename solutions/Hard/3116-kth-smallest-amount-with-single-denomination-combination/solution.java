// ──────────────────────────────────────────────────
// Problem  : 3116. Kth Smallest Amount With Single Denomination Combination
// Difficulty: Hard
// Tags     : Array, Math, Binary Search, Bit Manipulation, Combinatorics, Number Theory
// Link     : https://leetcode.com/problems/kth-smallest-amount-with-single-denomination-combination/
// Runtime  : 192 ms (beats 8%)
// Memory   : 43064000 (beats 100%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public long findKthSmallest(int[] coins, int k) {
        long low = 1;
        long high = (long) k * 25;
        long ans = high;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (countAmounts(coins, mid) >= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private long countAmounts(int[] coins, long target) {
        int n = coins.length;
        long count = 0;

        for (int i = 1; i < (1 << n); i++) {
            long lcmVal = 1;
            int bits = 0;
            boolean overflow = false;

            for (int j = 0; j < n; j++) {
                if (((i >> j) & 1) == 1) {
                    bits++;
                    lcmVal = lcm(lcmVal, coins[j]);
                    if (lcmVal > target) {
                        overflow = true;
                        break;
                    }
                }
            }

            if (overflow) {
                continue;
            }

            if (bits % 2 == 1) {
                count += target / lcmVal;
            } else {
                count -= target / lcmVal;
            }
        }

        return count;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
}