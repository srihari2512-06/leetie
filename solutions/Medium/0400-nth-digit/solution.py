# ──────────────────────────────────────────────────
# Problem  : 400. Nth Digit
# Difficulty: Medium
# Tags     : Math, Binary Search
# Link     : https://leetcode.com/problems/nth-digit/
# Runtime  : 0 ms (beats 100%)
# Memory   : 19036000 (beats 95%)
# Language : python3
# Copyright: (c) 2026 srihari2512-06. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

class Solution:
    def findNthDigit(self, n: int) -> int:
        # 9 numbers with 1 digit, 90 numbers with 2 digits, 900 numbers with 3 digits, etc.
        numbers_with_i_digits = 9
        power = 1
        digits = n
        for i in range(1,10):
            if(digits < numbers_with_i_digits * i):
                power = i - 1
                break
            digits -= numbers_with_i_digits * i
            numbers_with_i_digits *= 10

        if (digits == 0):
            return 9
        
        # Suppose its between 10 and 99. We need to check for (temp)th digit 
        start_of_range = pow(10,power)
        at_which_number = (digits - 1)//(power + 1)
        at_which_index = (digits - 1) % (power + 1)
        return int(str(start_of_range + at_which_number)[at_which_index])