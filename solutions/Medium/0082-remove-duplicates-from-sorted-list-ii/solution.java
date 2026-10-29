// ──────────────────────────────────────────────────
// Problem  : 82. Remove Duplicates from Sorted List II
// Difficulty: Medium
// Tags     : Linked List, Two Pointers
// Link     : https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
// Runtime  : 1 ms (beats 23%)
// Memory   : 44472000 (beats 90%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Dummy node handles duplicates at the beginning
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {

            // Duplicate group found
            if (curr.next != null && curr.val == curr.next.val) {
                int duplicateValue = curr.val;

                // Skip all nodes with this duplicate value
                while (curr != null && curr.val == duplicateValue) {
                    curr = curr.next;
                }

                // Connect previous unique node to next distinct node
                prev.next = curr;
            } else {
                // Current node is unique
                prev = curr;
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}