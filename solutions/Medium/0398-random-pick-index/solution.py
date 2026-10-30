# ──────────────────────────────────────────────────
# Problem  : 398. Random Pick Index
# Difficulty: Medium
# Tags     : Hash Table, Math, Reservoir Sampling, Randomized
# Link     : https://leetcode.com/problems/random-pick-index/
# Runtime  : 49 ms (beats 36%)
# Memory   : 28596000 (beats 89%)
# Language : python3
# Copyright: (c) 2026 srihari2512-06. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:

    def __init__(self, nums: list[int]):
        
        self.index_dict = {}
        
        for i, e in enumerate(nums):

            if(e not in self.index_dict):
                self.index_dict[e] = [i]

            else:
                self.index_dict[e].append(i)

    def pick(self, target: int) -> int:
        
        return random.choice(self.index_dict[target])
        


# Your Solution object will be instantiated and called as such:
# obj = Solution(nums)
# param_1 = obj.pick(target)