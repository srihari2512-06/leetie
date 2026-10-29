// ──────────────────────────────────────────────────
// Problem  : 2629. Function Composition
// Difficulty: Easy
// Tags     : N/A
// Link     : https://leetcode.com/problems/function-composition/
// Runtime  : 58 ms (beats 40%)
// Memory   : 56240000 (beats 8%)
// Language : javascript
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
	if (functions.length === 0) {
    return function(x) { return x; };
  }

  return functions.reduceRight(function(prevFn, nextFn) {
    return function(x) {
      return nextFn(prevFn(x));
    };
  });

};


const fn = compose([x => x + 1, x => 2 * x]);
console.log(fn(4)); // 9