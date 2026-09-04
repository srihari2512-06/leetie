// ──────────────────────────────────────────────────
// Problem  : 105. Construct Binary Tree from Preorder and Inorder Traversal
// Difficulty: Medium
// Tags     : Array, Hash Table, Divide and Conquer, Tree, Binary Tree
// Link     : https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
// Runtime  : 1 ms (beats 97%)
// Memory   : 46348000 (beats 51%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.HashMap;
import java.util.Map;

class Solution {
    private int preorderIndex;
    private Map<Integer, Integer> inorderIndexMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preorderIndex = 0;
        inorderIndexMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }

        return buildSubtree(preorder, 0, inorder.length - 1);
    }

    private TreeNode buildSubtree(int[] preorder, int left, int right) {
        if (left > right) {
            return null;
        }

        int rootVal = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootVal);

        int rootInorderIndex = inorderIndexMap.get(rootVal);

        root.left = buildSubtree(preorder, left, rootInorderIndex - 1);
        root.right = buildSubtree(preorder, rootInorderIndex + 1, right);

        return root;
    }
}