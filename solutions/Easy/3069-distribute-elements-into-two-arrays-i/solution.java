// ──────────────────────────────────────────────────
// Problem  : 3069. Distribute Elements Into Two Arrays I
// Difficulty: Easy
// Tags     : Array, Simulation
// Link     : https://leetcode.com/problems/distribute-elements-into-two-arrays-i/
// Runtime  : 2 ms (beats 57%)
// Memory   : 46504000 (beats 81%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for (int i = 2; i < nums.length; i++) {
            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }

        int[] result = new int[nums.length];
        int idx = 0;
        for (int val : arr1) {
            result[idx++] = val;
        }
        for (int val : arr2) {
            result[idx++] = val;
        }

        return result;
    }
}