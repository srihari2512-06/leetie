# ──────────────────────────────────────────────────
# Problem  : 396. Rotate Function
# Difficulty: Medium
# Tags     : Array, Math, Dynamic Programming
# Link     : https://leetcode.com/problems/rotate-function/
# Runtime  : 143 ms (beats 56%)
# Memory   : 30896000 (beats 96%)
# Language : python3
# Copyright: (c) 2026 srihari2512-06. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def maxRotateFunction(self, nums: List[int]) -> int:
        n=len(nums)
        Sum=sum(nums)
        ans=F=sum(i*x for i, x in enumerate(nums))
        for k in range(1, n):
            F+=Sum-n*nums[n-k]
            ans=max(ans, F)
        return ans
        