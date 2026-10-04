// ──────────────────────────────────────────────────
// Problem  : 72. Edit Distance
// Difficulty: Medium
// Tags     : String, Dynamic Programming
// Link     : https://leetcode.com/problems/edit-distance/
// Runtime  : 6 ms (beats 8%)
// Memory   : 47124000 (beats 52%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int dp[][] = new int[n+1][m+1];

        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                if(i==0){
                    dp[i][j] = j;
                }
                if(j==0){
                    dp[i][j] = i;
                }
            }
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    int add = dp[i][j-1]+1;
                    int delete = dp[i-1][j] +1;
                    int replace = dp[i-1][j-1] +1;

                    dp[i][j] = Math.min(add, Math.min(delete, replace));
                }
            }
        }

        return dp[n][m];
    }
}