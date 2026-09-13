// ──────────────────────────────────────────────────
// Problem  : 1782. Count Pairs Of Nodes
// Difficulty: Hard
// Tags     : Array, Hash Table, Two Pointers, Binary Search, Graph Theory, Sorting, Counting
// Link     : https://leetcode.com/problems/count-pairs-of-nodes/
// Runtime  : 1221 ms (beats 5%)
// Memory   : 201748000 (beats 6%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int[] countPairs(int n, int[][] edges, int[] queries) {
        int[] deg=new int[n];
        Map<String,Integer>mp=new HashMap<>();

        for(int[] e:edges){
            deg[e[0]-1]++;
            deg[e[1]-1]++;
            if(e[0]>e[1]){
                int t=e[1];
                e[1]=e[0];
                e[0]=t;

            }
            String s=String.valueOf(e[0]-1)+"#"+String.valueOf(e[1]-1);
            mp.put(s,mp.getOrDefault(s,0)+1);
        }
        int[] sorted=deg.clone();
        Arrays.sort(sorted);

        int[]res=new int[queries.length];

        for(int i=0;i<queries.length;i++){
            int ans=0;

            int l=0;
            int r=sorted.length-1;

            while(l<r){
                if(sorted[l]+sorted[r]>queries[i]){
                    ans+=(r-l);
                    r--;
                }
                else{
                    l++;
                }
            }

            for(String st:mp.keySet()){
                String[] str = st.split("#");
                int f=Integer.valueOf(str[0]);
                int s=Integer.valueOf(str[1]);

                if(deg[f]+deg[s]>queries[i] && deg[f]+deg[s]-mp.get(st)<=queries[i]){
                    ans--;
                }
            }
            res[i]=ans;
        }
        return res;
    }
}