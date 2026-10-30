# ──────────────────────────────────────────────────
# Problem  : 382. Linked List Random Node
# Difficulty: Medium
# Tags     : Linked List, Math, Reservoir Sampling, Randomized
# Link     : https://leetcode.com/problems/linked-list-random-node/
# Runtime  : 16 ms (beats 69%)
# Memory   : 22976000 (beats 81%)
# Language : python3
# Copyright: (c) 2026 srihari2512-06. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────


class Solution:

    def __init__(self, head: ListNode):
        self.nodes = []
        while head:
            self.nodes.append(head.val)
            head = head.next

    def getRandom(self) -> int:
        i = random.randint(0, len(self.nodes) - 1)
        return self.nodes[i]