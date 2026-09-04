// ──────────────────────────────────────────────────
// Problem  : 107. Binary Tree Level Order Traversal II
// Difficulty: Medium
// Tags     : Tree, Breadth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
// Runtime  : 1 ms (beats 98%)
// Memory   : 44756000 (beats 7%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }

            result.add(0, currentLevel);
        }

        return result;
    }
}