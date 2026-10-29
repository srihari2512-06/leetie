// ──────────────────────────────────────────────────
// Problem  : 2620. Counter
// Difficulty: Easy
// Tags     : N/A
// Link     : https://leetcode.com/problems/counter/
// Runtime  : 43 ms (beats 56%)
// Memory   : 54664000 (beats 9%)
// Language : javascript
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

function createCounter(start) {
  let count = start;
  return function() {
    return count++;
  }
}