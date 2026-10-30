// ──────────────────────────────────────────────────
// Problem  : 478. Generate Random Point in a Circle
// Difficulty: Medium
// Tags     : Math, Geometry, Rejection Sampling, Randomized
// Link     : https://leetcode.com/problems/generate-random-point-in-a-circle/
// Runtime  : 217 ms (beats 23%)
// Memory   : 56136000 (beats 97%)
// Language : java
// Copyright: (c) 2026 srihari2512-06. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    private static final Random random = new Random();
    private double radius, x_center, y_center;

    public Solution(double radius, double x_center, double y_center) {
        this.radius = radius;
        this.x_center = x_center;
        this.y_center = y_center;
    }
    
    public double[] randPoint() {
        double r = Math.sqrt(random.nextDouble()) * radius, theta = random.nextDouble() * 2 * Math.PI;
        return new double[] { x_center + r * Math.cos(theta), y_center + r * Math.sin(theta) };
    }
}