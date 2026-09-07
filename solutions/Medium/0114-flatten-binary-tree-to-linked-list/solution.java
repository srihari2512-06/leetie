// ──────────────────────────────────────────────────
// Problem  : 114. Flatten Binary Tree to Linked List
// Difficulty: Medium
// Tags     : Linked List, Stack, Tree, Depth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
// Runtime  : 0 ms (beats 100%)
// Memory   : 44012000 (beats 34%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

public class Solution {
    private TreeNode prev = null;

    public void flatten(TreeNode root) {
        if (root == null) return;

        // Process right subtree first
        flatten(root.right);

        // Process left subtree
        flatten(root.left);

        // Set the current node's right to prev and left to null
        root.right = prev;
        root.left = null;

        // Update prev to current node
        prev = root;
    }
}