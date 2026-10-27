// ──────────────────────────────────────────────────
// Problem  : 124. Binary Tree Maximum Path Sum
// Difficulty: Hard
// Tags     : Dynamic Programming, Tree, Depth-First Search, Binary Tree, DP on Trees
// Link     : https://leetcode.com/problems/binary-tree-maximum-path-sum/
// Runtime  : 1 ms (beats 42%)
// Memory   : 46068000 (beats 96%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPathSumUtil(root);
        return maxSum;
    }

    public int maxPathSumUtil(TreeNode root){
        if(root == null) 
            return 0;
        
        int ls = Math.max(0, maxPathSumUtil(root.left));
        int rs = Math.max(0, maxPathSumUtil(root.right));

        int val = root.val;

        maxSum = Math.max(maxSum, Math.max(ls + rs + root.val, root.val));

        return val + Math.max(ls, rs);
    }
}