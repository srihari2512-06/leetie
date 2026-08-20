// ──────────────────────────────────────────────────
// Problem  : 1287. Element Appearing More Than 25% In Sorted Array
// Difficulty: Easy
// Tags     : Array
// Link     : https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
// Runtime  : 0 ms (beats 100%)
// Memory   : 46252000 (beats 69%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int target = n / 4;
        for (int i = 0; i < n - target; i++) {
            if (arr[i] == arr[i + target]) {
                return arr[i];
            }
        }
        return -1;
    }
}