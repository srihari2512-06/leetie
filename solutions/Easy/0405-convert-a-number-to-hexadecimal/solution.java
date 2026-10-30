// ──────────────────────────────────────────────────
// Problem  : 405. Convert a Number to Hexadecimal
// Difficulty: Easy
// Tags     : Math, String, Bit Manipulation
// Link     : https://leetcode.com/problems/convert-a-number-to-hexadecimal/
// Runtime  : 1 ms (beats 23%)
// Memory   : 42244000 (beats 82%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        long val=num;
    if(num<0){
   val = (long)(Math.pow(2,32)) + num;
    }
         StringBuilder s = new StringBuilder();
       String hexCode="0123456789abcdef";
        while(val>0){
            int rem=(int)(val%16);
           s.append(hexCode.charAt(rem));
           val/=16;
        }
        return s.reverse().toString();
       
    }
}