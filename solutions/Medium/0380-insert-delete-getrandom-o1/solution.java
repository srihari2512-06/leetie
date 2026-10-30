// ──────────────────────────────────────────────────
// Problem  : 380. Insert Delete GetRandom O(1)
// Difficulty: Medium
// Tags     : Array, Hash Table, Math, Design, Randomized
// Link     : https://leetcode.com/problems/insert-delete-getrandom-o1/
// Runtime  : 26 ms (beats 76%)
// Memory   : 100180000 (beats 65%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class RandomizedSet {

    private List<Integer> values;
    private Map<Integer, Integer> valuesIdx;

    public RandomizedSet() {
        this.values = new ArrayList<>();
        this.valuesIdx = new HashMap<>();
    }

    public boolean insert(int val) {
        if (valuesIdx.containsKey(val)) {
            return false;
        }

        valuesIdx.put(val, values.size());
        values.add(val);

        return true;
    }

    public boolean remove(int val) {
        if (!valuesIdx.containsKey(val)) {
            return false;
        }

        int index = valuesIdx.get(val);
        valuesIdx.put(values.get(values.size() - 1), index);
        valuesIdx.remove(val);
        values.set(index, values.get(values.size() - 1));
        values.remove(values.size() - 1);

        return true;
    }

    public int getRandom() {
        int index = (int) (Math.random() * values.size());
        return values.get(index);
    }
}