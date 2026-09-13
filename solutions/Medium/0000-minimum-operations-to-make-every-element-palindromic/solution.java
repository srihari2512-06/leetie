// ──────────────────────────────────────────────────
// Problem  : 0. Minimum Operations to Make Every Element Palindromic
// Difficulty: Medium
// Tags     : N/A
// Link     : https://leetcode.com/problems/minimum-operations-to-make-every-element-palindromic/
// Runtime  : 31 ms (beats 0%)
// Memory   : 49400000 (beats 0%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    private static final List<Integer> PALINDROMES = new ArrayList<>();
    
    static {
        for (int i = 1; i <= 9; i++) {
            PALINDROMES.add(i);
        }
        for (int i = 1; i <= 9; i++) {
            PALINDROMES.add(i * 11);
        }
        
        for (int len = 3; len <= 9; len++) {
            int halfLen = (len + 1) / 2;
            int start = (int) Math.pow(10, halfLen - 1);
            int end = (int) Math.pow(10, halfLen) - 1;
            
            for (int i = start; i <= end; i++) {
                String s = Integer.toString(i);
                StringBuilder sb = new StringBuilder(s);
                if (len % 2 == 1) {
                    for (int j = s.length() - 2; j >= 0; j--) {
                        sb.append(s.charAt(j));
                    }
                } else {
                    for (int j = s.length() - 1; j >= 0; j--) {
                        sb.append(s.charAt(j));
                    }
                }
                long val = Long.parseLong(sb.toString());
                if (val <= 2000000000L) {
                    PALINDROMES.add((int) val);
                }
            }
        }
        Collections.sort(PALINDROMES);
    }

    public long minOperations(int[] nums) {
        long totalOps = 0;

        for (int x : nums) {
            int idx = Collections.binarySearch(PALINDROMES, x);
            if (idx >= 0) {
                continue;
            }

            int insertIdx = -idx - 1;
            long minOps = Long.MAX_VALUE;

            for (int i = Math.max(0, insertIdx - 100); i < Math.min(PALINDROMES.size(), insertIdx + 100); i++) {
                int p = PALINDROMES.get(i);
                int diff = Math.abs(x - p);
                if (diff % 2 == 0) {
                    minOps = Math.min(minOps, diff / 2);
                }
            }

            totalOps += minOps;
        }

        return totalOps;
    }
}
[10,12,14,16]
[9,10,11,10]
[125]
9
2
2