// ──────────────────────────────────────────────────
// Problem  : 1286. Iterator for Combination
// Difficulty: Medium
// Tags     : String, Backtracking, Design, Iterator
// Link     : https://leetcode.com/problems/iterator-for-combination/
// Runtime  : 10 ms (beats 97%)
// Memory   : 48532000 (beats 92%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class CombinationIterator {
    private List<String> combinations;
    private int index;

    public CombinationIterator(String characters, int combinationLength) {
        combinations = new ArrayList<>();
        index = 0;
        generateCombinations(characters, combinationLength, 0, new StringBuilder());
    }

    private void generateCombinations(String characters, int length, int start, StringBuilder current) {
        if (current.length() == length) {
            combinations.add(current.toString());
            return;
        }
        for (int i = start; i < characters.length(); i++) {
            current.append(characters.charAt(i));
            generateCombinations(characters, length, i + 1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public String next() {
        return combinations.get(index++);
    }

    public boolean hasNext() {
        return index < combinations.size();
    }
}