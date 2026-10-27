// ──────────────────────────────────────────────────
// Problem  : 134. Gas Station
// Difficulty: Medium
// Tags     : Array, Greedy
// Link     : https://leetcode.com/problems/gas-station/
// Runtime  : 2 ms (beats 40%)
// Memory   : 112612000 (beats 47%)
// Language : cpp
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        int totalGas = 0, totalCost = 0;
        for (int i = 0; i < gas.size(); i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if (totalGas < totalCost) {
            return -1;
        }

        int currentGas = 0;
        int start = 0;

        for (int i = 0; i < gas.size(); i++) {
            currentGas += gas[i] - cost[i];
            if (currentGas < 0) {
                currentGas = 0;
                start = i + 1;
            }
        }

        return start;        
    }
};