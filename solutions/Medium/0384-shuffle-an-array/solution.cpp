// ──────────────────────────────────────────────────
// Problem  : 384. Shuffle an Array
// Difficulty: Medium
// Tags     : Array, Math, Design, Randomized
// Link     : https://leetcode.com/problems/shuffle-an-array/
// Runtime  : 24 ms (beats 16%)
// Memory   : 63588000 (beats 69%)
// Language : cpp
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

random_device rd;
mt19937_64 gen(rd());
uniform_int_distribution<int> dist(0, INT_MAX);
class Solution {
    vector<int> arr;
    int n;
public:
    // use initial list for the constructor to create the object
    Solution(vector<int>& nums) : arr(nums), n(nums.size()){}
    
    vector<int> reset() {
        return arr;
    }
    
    vector<int> shuffle() {
        vector<int> ans=arr;
        for(int i=0; i<n-1; i++)
            swap(ans[i], ans[i+dist(gen)%(n-i)]);
        return ans;
    }
};

/**
 * Your Solution object will be instantiated and called as such:
 * Solution* obj = new Solution(nums);
 * vector<int> param_1 = obj->reset();
 * vector<int> param_2 = obj->shuffle();
 */