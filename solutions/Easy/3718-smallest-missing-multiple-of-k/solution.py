# ──────────────────────────────────────────────────
# Problem  : 3718. Smallest Missing Multiple of K
# Difficulty: Easy
# Tags     : Array, Hash Table
# Link     : https://leetcode.com/problems/smallest-missing-multiple-of-k/
# Runtime  : 0 ms (beats 100%)
# Memory   : 19288000 (beats 53%)
# Language : python3
# Copyright: (c) 2026 srihari2512-06. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def missingMultiple(self, nums: List[int], k: int) -> int:
        num = set(nums)
        target = k
        while target in num:
            target += k
        return target 