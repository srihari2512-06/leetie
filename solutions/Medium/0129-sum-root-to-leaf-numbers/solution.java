// ──────────────────────────────────────────────────
// Problem  : 129. Sum Root to Leaf Numbers
// Difficulty: Medium
// Tags     : Tree, Depth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/sum-root-to-leaf-numbers/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42652000 (beats 81%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    int sum = 0;

    public int sumNumbers(TreeNode root) {
        helper(root, 0);
        return sum;
    }

    void helper(TreeNode node, int path) {
        if (node == null) return;
        path = path * 10 + node.val;
        if (node.left == null && node.right == null) {
            sum += path;
        }
        helper(node.left, path);
        helper(node.right, path);
    }
}