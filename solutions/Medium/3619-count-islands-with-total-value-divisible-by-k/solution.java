// ──────────────────────────────────────────────────
// Problem  : 3619. Count Islands With Total Value Divisible by K
// Difficulty: Medium
// Tags     : Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix
// Link     : https://leetcode.com/problems/count-islands-with-total-value-divisible-by-k/
// Runtime  : 30 ms (beats 15%)
// Memory   : 116468000 (beats 33%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int countIslands(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int c = 0;
        boolean[][] vis = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]>0 && !vis[i][j]){
                    long sum = dfs(grid,vis,i,j);
                    if(sum%k==0){
                        c++;
                    }
                }
            }
        }
        return c;
    }
    long dfs(int[][] grid,boolean[][] vis,int i, int j){
        int n = grid.length;
        int m = grid[0].length;
        if(i<0||j<0||i>=n||j>=m){
            return 0;
        }
        if(vis[i][j]||grid[i][j]==0){
            return 0;
        }
        long sum = grid[i][j];
        vis[i][j] = true;
        sum += dfs(grid,vis,i+1,j);
        sum += dfs(grid,vis,i-1,j);
        sum += dfs(grid,vis,i,j-1);
        sum += dfs(grid,vis,i,j+1);
        return sum;
    }
}