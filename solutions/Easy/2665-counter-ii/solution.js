// ──────────────────────────────────────────────────
// Problem  : 2665. Counter II
// Difficulty: Easy
// Tags     : N/A
// Link     : https://leetcode.com/problems/counter-ii/
// Runtime  : 54 ms (beats 32%)
// Memory   : 57312000 (beats 32%)
// Language : javascript
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

var createCounter = function(init) {
  let presentCount = init;

  function increment() {
    return ++presentCount;
  }

  function decrement() {
      return --presentCount;
  }

  function reset() {
      return (presentCount = init);
  }

  return { increment, decrement, reset };
};