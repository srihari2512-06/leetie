// ──────────────────────────────────────────────────
// Problem  : 2553. Separate the Digits in an Array
// Difficulty: Easy
// Tags     : Array, Simulation
// Link     : https://leetcode.com/problems/separate-the-digits-in-an-array/
// Runtime  : 4 ms (beats 88%)
// Memory   : 46448000 (beats 79%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums) {
            int[] digit = new int[10];
            int idx = 0;

            while (num != 0) {
                digit[idx++] = num % 10;
                num /= 10;
            }

            for (int i = idx - 1; i >= 0; i--) {
                list.add(digit[i]);
            }
        }

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}