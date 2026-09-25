// ──────────────────────────────────────────────────
// Problem  : 1096. Brace Expansion II
// Difficulty: Hard
// Tags     : Hash Table, String, Backtracking, Stack, Breadth-First Search, Sorting
// Link     : https://leetcode.com/problems/brace-expansion-ii/
// Runtime  : 28 ms (beats 22%)
// Memory   : 47148000 (beats 64%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public List<String> braceExpansionII(String expression) {
        Set<String> s = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.add(expression);

        while (!q.isEmpty()) {
            String temp = q.poll();
            int left = -1, right = 0;
            while (right < temp.length() && temp.charAt(right) != '}') {
                if (temp.charAt(right) == '{') {
                    left = right;
                }
                right++;
            }
            if (left == -1) {
                s.add(temp);
                continue;
            }
            String start = temp.substring(0, left);
            String end = temp.substring(right+1, temp.length());

            String words[] = temp.substring(left + 1, right).split(",");
            for (String w : words) {
                q.add(new StringBuilder().append(start).append(w).append(end).toString());
            }
        }

        List<String> list = new ArrayList<>(s);
        Collections.sort(list);
        return list;
    }
}