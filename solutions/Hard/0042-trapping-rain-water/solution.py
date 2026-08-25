# ──────────────────────────────────────────────────
# Problem  : 42. Trapping Rain Water
# Difficulty: Hard
# Tags     : Array, Two Pointers, Dynamic Programming, Stack, Monotonic Stack
# Link     : https://leetcode.com/problems/trapping-rain-water/
# Runtime  : 3 ms (beats 95%)
# Memory   : 20848000 (beats 98%)
# Language : python3
# Copyright: (c) 2026 srihari2512-06. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def trap(self, height: List[int]) -> int:
        water = 0
        left = 0
        right = len(height)-1
        leftMax = 0
        rightMax = 0

        while left < right:
            if height[left] <= height[right]:
                if leftMax < height[left]:
                    leftMax = height[left]
                else:
                    water += leftMax - height[left]

                left += 1
            
            else:
                if rightMax < height[right]:
                    rightMax = height[right]
                else:
                    water += rightMax - height[right]

                right -= 1
        
        return water
