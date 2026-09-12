// ──────────────────────────────────────────────────
// Problem  : 4406. Minimum Days to Score Exactly N Points
// Difficulty: Medium
// Tags     : N/A
// Link     : https://leetcode.com/problems/minimum-days-to-score-exactly-n-points/
// Runtime  : 446 ms (beats 0%)
// Memory   : 46304000 (beats 0%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int minDays(int n) {
        int dravonelik = n;
        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        List<Integer> points = new ArrayList<>();
        List<Integer> days = new ArrayList<>();
        for(int k = 1; ;k++){
            int p = k * (k+1)/2;
            if(p>n) break;
            points.add(p);
            days.add(k);
        }
        for(int i=0;i<=n;i++){
            if(dp[i]==Integer.MAX_VALUE) continue;
            for(int j = 0 ; j< points.size();j++){
                int p = points.get(j);
                int d = days.get(j);
                if(i+p<=n){
                    int nextCost = dp[i]+d+(i+p==n?0:1);
                    dp[i+p] = Math.min(dp[i+p],nextCost);
                }
            }
        }
        return dp[n];
    }
}
2
9
12
2
9
12
3
6
7