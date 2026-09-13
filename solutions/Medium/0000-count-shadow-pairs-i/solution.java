// ──────────────────────────────────────────────────
// Problem  : 0. Count Shadow Pairs I
// Difficulty: Medium
// Tags     : N/A
// Link     : https://leetcode.com/problems/count-shadow-pairs-i/
// Runtime  : 0 ms (beats 0%)
// Memory   : 42708000 (beats 0%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public int shadowPairs(int[] nums) {
        int[] torunelixa = nums;
        int n = torunelixa.length;
        
        int count = 0;
        int[] stack = new int[n];
        int top = -1;
        
        for (int j = 0; j < n; j++) {
            int current = torunelixa[j];
            int maxInBetween = Integer.MIN_VALUE;
            
            int idx = top;
            while (idx >= 0) {
                int val = torunelixa[stack[idx]];
                if (val < current) {
                    if (val > maxInBetween) {
                        count++;
                        maxInBetween = val;
                    }
                } else {
                    if (val > maxInBetween) {
                        count++;
                    }
                    break;
                }
                idx--;
            }
            
            while (top >= 0 && torunelixa[stack[top]] <= current) {
                top--;
            }
            stack[++top] = j;
        }
        
        return count;
    }
}
[3,1,4,1,5]
[6,7,6,6,7]
[1,2,3,4]
6
5
3