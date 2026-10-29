// ──────────────────────────────────────────────────
// Problem  : 2626. Array Reduce Transformation
// Difficulty: Easy
// Tags     : N/A
// Link     : https://leetcode.com/problems/array-reduce-transformation/
// Runtime  : 44 ms (beats 68%)
// Memory   : 54956000 (beats 26%)
// Language : javascript
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
  let val = init;
  for (let i = 0; i < nums.length; i++) {
    val = fn(val, nums[i]);
  }
  return val;
};