// ──────────────────────────────────────────────────
// Problem  : 71. Simplify Path
// Difficulty: Medium
// Tags     : String, Stack
// Link     : https://leetcode.com/problems/simplify-path/
// Runtime  : 4 ms (beats 94%)
// Memory   : 45048000 (beats 36%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String simplifyPath(String s) {
        Stack<String> stack = new Stack<>();

        String[] components = s.split("/");
        
        for (String component : components) {
            if (component.equals(".") || component.isEmpty())  continue;
                else if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } 
            else {
                stack.push(component);
            }
        }
        
        if (stack.isEmpty()) {
            return "/";
        }
        
        StringBuilder ans = new StringBuilder();
        for (String dir : stack) {
            ans.append("/").append(dir);
        }
        
        return ans.toString();
    }
}