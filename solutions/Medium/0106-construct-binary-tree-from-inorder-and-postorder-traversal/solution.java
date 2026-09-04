// ──────────────────────────────────────────────────
// Problem  : 106. Construct Binary Tree from Inorder and Postorder Traversal
// Difficulty: Medium
// Tags     : Array, Hash Table, Divide and Conquer, Tree, Binary Tree
// Link     : https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
// Runtime  : 1 ms (beats 99%)
// Memory   : 46556000 (beats 21%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.HashMap;
import java.util.Map;

class Solution {
    private int postorderIndex;
    private Map<Integer, Integer> inorderIndexMap;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postorderIndex = postorder.length - 1;
        inorderIndexMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }

        return buildSubtree(postorder, 0, inorder.length - 1);
    }

    private TreeNode buildSubtree(int[] postorder, int left, int right) {
        if (left > right) {
            return null;
        }

        int rootVal = postorder[postorderIndex--];
        TreeNode root = new TreeNode(rootVal);

        int rootInorderIndex = inorderIndexMap.get(rootVal);

        root.right = buildSubtree(postorder, rootInorderIndex + 1, right);
        root.left = buildSubtree(postorder, left, rootInorderIndex - 1);

        return root;
    }
}