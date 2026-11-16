// ──────────────────────────────────────────────────
// Problem  : 166. Fraction to Recurring Decimal
// Difficulty: Medium
// Tags     : Hash Table, Math, String
// Link     : https://leetcode.com/problems/fraction-to-recurring-decimal/
// Runtime  : 2 ms (beats 66%)
// Memory   : 42752000 (beats 28%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";

        StringBuilder result = new StringBuilder();
        
        if ((numerator < 0) ^ (denominator < 0)) result.append("-");

        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        
        result.append(num / den);
        long remainder = num % den;
        if (remainder == 0) return result.toString();

        
        result.append(".");
        Map<Long, Integer> map = new HashMap<>();
        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                int idx = map.get(remainder);
                result.insert(idx, "(");
                result.append(")");
                return result.toString();
            }
            map.put(remainder, result.length());
            remainder *= 10;
            result.append(remainder / den);
            remainder %= den;
        }
        return result.toString();
    }
}