# ──────────────────────────────────────────────────
# Problem  : 2089. Find Target Indices After Sorting Array
# Difficulty: Easy
# Tags     : Array, Binary Search, Sorting
# Link     : https://leetcode.com/problems/find-target-indices-after-sorting-array/
# Runtime  : 0 ms (beats 100%)
# Memory   : 19304000 (beats 24%)
# Language : python3
# Copyright: (c) 2026 srihari2512-06. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def targetIndices(self, nums: list[int], target: int) -> list[int]:
        nums.sort()
        return [i for i in range(len(nums)) if nums[i]==target]