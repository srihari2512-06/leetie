-- ──────────────────────────────────────────────────
-- Problem  : 181. Employees Earning More Than Their Managers
-- Difficulty: Easy
-- Tags     : Database
-- Link     : https://leetcode.com/problems/employees-earning-more-than-their-managers/
-- Runtime  : 389 ms (beats 73%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 srihari2512-06. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

# Write your MySQL query statement below
select e1.name as Employee
from Employee e1
join Employee e2 on e1.managerId = e2.id
where e1.salary >e2.salary;