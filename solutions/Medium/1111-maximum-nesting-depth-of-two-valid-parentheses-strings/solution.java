// ──────────────────────────────────────────────────
// Problem  : 1111. Maximum Nesting Depth of Two Valid Parentheses Strings
// Difficulty: Medium
// Tags     : String, Stack, Bracket Sequences
// Link     : https://leetcode.com/problems/maximum-nesting-depth-of-two-valid-parentheses-strings/
// Runtime  : 2 ms (beats 58%)
// Memory   : 45724000 (beats 5%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] answer = new int[seq.length()];
        int currentGroup = 1;

        for (int index = 0; index < seq.length(); index++) {
            char bracket = seq.charAt(index);

            if (bracket == '(') {
                answer[index] = 1 - currentGroup;
            } else {
                answer[index] = currentGroup;
            }

            currentGroup ^= 1;
        }

        return answer;
    }
}