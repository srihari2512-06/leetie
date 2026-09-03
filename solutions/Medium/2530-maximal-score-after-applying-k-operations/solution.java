// ──────────────────────────────────────────────────
// Problem  : 2530. Maximal Score After Applying K Operations
// Difficulty: Medium
// Tags     : Array, Greedy, Heap (Priority Queue)
// Link     : https://leetcode.com/problems/maximal-score-after-applying-k-operations/
// Runtime  : 116 ms (beats 93%)
// Memory   : 105332000 (beats 74%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.PriorityQueue;

class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        for (int num : nums) {
            maxHeap.add(num);
        }

        long score = 0;
        while (k > 0) {
            int val = maxHeap.poll();
            score += val;
            maxHeap.add((val + 2) / 3);
            k--;
        }

        return score;
    }
}