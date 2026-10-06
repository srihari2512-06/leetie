# ──────────────────────────────────────────────────
# Problem  : 76. Minimum Window Substring
# Difficulty: Hard
# Tags     : Hash Table, String, Sliding Window
# Link     : https://leetcode.com/problems/minimum-window-substring/
# Runtime  : 65 ms (beats 64%)
# Memory   : 19720000 (beats 38%)
# Language : python3
# Copyright: (c) 2026 srihari2512-06. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if not s or not t:
            return ""

        dictT = defaultdict(int)
        for c in t:
            dictT[c] += 1

        required = len(dictT)
        l, r = 0, 0
        formed = 0

        windowCounts = defaultdict(int)
        ans = [-1, 0, 0]

        while r < len(s):
            c = s[r]
            windowCounts[c] += 1

            if c in dictT and windowCounts[c] == dictT[c]:
                formed += 1

            while l <= r and formed == required:
                c = s[l]

                if ans[0] == -1 or r - l + 1 < ans[0]:
                    ans[0] = r - l + 1
                    ans[1] = l
                    ans[2] = r

                windowCounts[c] -= 1
                if c in dictT and windowCounts[c] < dictT[c]:
                    formed -= 1

                l += 1

            r += 1

        return "" if ans[0] == -1 else s[ans[1]:ans[2] + 1]
