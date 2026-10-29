// ──────────────────────────────────────────────────
// Problem  : 2667. Create Hello World Function
// Difficulty: Easy
// Tags     : N/A
// Link     : https://leetcode.com/problems/create-hello-world-function/
// Runtime  : 45 ms (beats 38%)
// Memory   : 52616000 (beats 91%)
// Language : javascript
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(...args) {
        return "Hello World"
        
    }
};


  const f = createHelloWorld();
  f(); // "Hello World"