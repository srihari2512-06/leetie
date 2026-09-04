// ──────────────────────────────────────────────────
// Problem  : 103. Problems
// Difficulty: Easy
// Tags     : N/A
// Link     : https://leetcode.com/problems//
// Runtime  : 0 ms (beats 100%)
// Memory   : 44032000 (beats 10%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> level = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();

                // Insert based on traversal direction
                if (leftToRight) {
                    level.addLast(curr.val);
                } else {
                    level.addFirst(curr.val);
                }

                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }

            res.add(level);
            leftToRight = !leftToRight; // Flip direction for next level
        }

        return res;
    }
}