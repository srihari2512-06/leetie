// ──────────────────────────────────────────────────
// Problem  : 2704. To Be Or Not To Be
// Difficulty: Easy
// Tags     : N/A
// Link     : https://leetcode.com/problems/to-be-or-not-to-be/
// Runtime  : 44 ms (beats 57%)
// Memory   : 54820000 (beats 7%)
// Language : javascript
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

var expect = function(val) {
    return {
        toBe: function(otherVal) {
            if (val === otherVal) return true;
            else throw new Error("Not Equal");
        },
        notToBe: function(otherVal) {
            if (val !== otherVal) return true;
            else throw new Error("Equal");
        }
    };
};