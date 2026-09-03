// ──────────────────────────────────────────────────
// Problem  : 2526. Find Consecutive Integers from a Data Stream
// Difficulty: Medium
// Tags     : Hash Table, Design, Queue, Counting, Data Stream
// Link     : https://leetcode.com/problems/find-consecutive-integers-from-a-data-stream/
// Runtime  : 26 ms (beats 83%)
// Memory   : 104408000 (beats 43%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class DataStream {
    private final int value;
    private final int k;
    private int count;

    public DataStream(int value, int k) {
        this.value = value;
        this.k = k;
        this.count = 0;
    }
    
    public boolean consec(int num) {
        if(num==this.value){
            this.count++;
        }else{
            this.count=0;
        }
        return this.count >= this.k;
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */