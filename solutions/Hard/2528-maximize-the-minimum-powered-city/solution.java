// ──────────────────────────────────────────────────
// Problem  : 2528. Maximize the Minimum Powered City
// Difficulty: Hard
// Tags     : Array, Binary Search, Greedy, Queue, Sliding Window, Prefix Sum
// Link     : https://leetcode.com/problems/maximize-the-minimum-powered-city/
// Runtime  : 29 ms (beats 71%)
// Memory   : 87184000 (beats 17%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public long maxPower(int[] stations, int r, int k) {
        int n = stations.length;
        long[] power = new long[n];
        long sum = 0;
        
        for (int i = 0; i <= Math.min(n - 1, r); i++) {
            sum += stations[i];
        }
        power[0] = sum;
        
        for (int i = 1; i < n; i++) {
            if (i + r < n) {
                sum += stations[i + r];
            }
            if (i - r - 1 >= 0) {
                sum -= stations[i - r - 1];
            }
            power[i] = sum;
        }

        long low = 0;
        long high = 0;
        for (int st : stations) {
            high += st;
        }
        high += k;

        long ans = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (check(mid, power, n, r, k)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private boolean check(long target, long[] power, int n, int r, long k) {
        long[] added = new long[n];
        long windowAdd = 0;
        
        for (int i = 0; i < n; i++) {
            if (i - r - 1 >= 0) {
                windowAdd -= added[i - r - 1];
            }
            long currentPower = power[i] + windowAdd;
            if (currentPower < target) {
                long needed = target - currentPower;
                if (needed > k) {
                    return false;
                }
                k -= needed;
                added[Math.min(n - 1, i + r)] += needed;
                windowAdd += needed;
            }
        }
        return true;
    }
}