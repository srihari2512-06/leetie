// ──────────────────────────────────────────────────
// Problem  : 94. Binary Tree Inorder Traversal
// Difficulty: Easy
// Tags     : Stack, Tree, Depth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/binary-tree-inorder-traversal/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43176000 (beats 51%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private List<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return res;
    }
    private void traverse(TreeNode root){
        if(root==null){
            return;
        }
        traverse(root.left);
        res.add(root.val);
        traverse(root.right);
    }
}