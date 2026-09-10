// ──────────────────────────────────────────────────
// Problem  : 2265. Count Nodes Equal to Average of Subtree
// Difficulty: Medium
// Tags     : Tree, Depth-First Search, Binary Tree
// Link     : https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/
// Runtime  : 0 ms (beats 100%)
// Memory   : 45596000 (beats 49%)
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
    private int matchingNodesCount =0;

    public int averageOfSubtree(TreeNode root) {
        matchingNodesCount =0 ;
        dfs(root);
        return matchingNodesCount;

    }
    private int[] dfs(TreeNode node){
        if(node==null){
            return new int[]{0,0};
        }
        int[] left = dfs(node.left);
        int[] right = dfs(node.right);
        int currsum = left[0] + right[0] + node.val;
        int currcount = left[1] + right[1] +1 ;
        if(currsum/currcount==node.val){
            matchingNodesCount++;
        }
        return new int[]{currsum,currcount};
    }
}