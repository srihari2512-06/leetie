// ──────────────────────────────────────────────────
// Problem  : 145. Binary Tree Postorder Traversal
// Difficulty: Easy
// Tags     : Stack, Tree, Depth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/binary-tree-postorder-traversal/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43188000 (beats 53%)
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        
        postOrder(root,l);
        return l;
    }
    static void postOrder(TreeNode node, List<Integer> res) {
        if (node == null){
            return ;
    }
        postOrder(node.left, res);

        postOrder(node.right, res);

        res.add(node.val);
    }
}
