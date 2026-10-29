// ──────────────────────────────────────────────────
// Problem  : 2635. Apply Transform Over Each Element in Array
// Difficulty: Easy
// Tags     : N/A
// Link     : https://leetcode.com/problems/apply-transform-over-each-element-in-array/
// Runtime  : 44 ms (beats 53%)
// Memory   : 52656000 (beats 93%)
// Language : javascript
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

var map = function(arr, fn) {
  const transformedArr = [];
  for (let i = 0; i < arr.length; i++) {
    transformedArr[i] = fn(arr[i], i);
  }
  return transformedArr;
};