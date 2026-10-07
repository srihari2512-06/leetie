-- ──────────────────────────────────────────────────
-- Problem  : 184. Department Highest Salary
-- Difficulty: Medium
-- Tags     : Database
-- Link     : https://leetcode.com/problems/department-highest-salary/
-- Runtime  : 1026 ms (beats 37%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 srihari2512-06. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

# Write your MySQL query statement below
select d.name as Department,
       e.name as Employee,
       e.salary as Salary
from Employee e
join Department d on e.departmentId = d.id
where e.salary = (
    select max(salary)
    from Employee
    where departmentId = e.departmentId
);