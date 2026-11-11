// ──────────────────────────────────────────────────
// Problem  : 3789. Minimum Cost to Acquire Required Items
// Difficulty: Medium
// Tags     : Math, Greedy
// Link     : https://leetcode.com/problems/minimum-cost-to-acquire-required-items/
// Runtime  : 0 ms (beats 100%)
// Memory   : 9348000 (beats 20%)
// Language : cpp
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
public:
    long long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        if (need1>need2) return minimumCost(cost2, cost1, costBoth, need2, need1);
        long long collectBoth=(long long)need1*min(cost1+cost2, costBoth);
        long long collect2=(long long)(need2-need1)*min(cost2, costBoth);
        return collectBoth+collect2;    
    }
};