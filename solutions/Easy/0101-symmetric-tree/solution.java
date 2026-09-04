// ──────────────────────────────────────────────────
// Problem  : 101. Symmetric Tree
// Difficulty: Easy
// Tags     : Tree, Depth-First Search, Breadth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/symmetric-tree/
// Runtime  : 0 ms (beats 100%)
// Memory   : 43268000 (beats 93%)
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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isMirror(root.left,root.right);

    }
    private boolean isMirror(TreeNode t1 , TreeNode t2){
        if(t1==null && t2==null) return true;
        if(t1==null || t2==null) return false;

        return (t1.val == t2.val)
            && isMirror(t1.left,t2.right)
            && isMirror(t1.right, t2.left);
    }
}