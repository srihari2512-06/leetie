-- ──────────────────────────────────────────────────
-- Problem  : 185. Department Top Three Salaries
-- Difficulty: Hard
-- Tags     : Database
-- Link     : https://leetcode.com/problems/department-top-three-salaries/
-- Runtime  : 1206 ms (beats 41%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 srihari2512-06. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

with new_table as (
    select
        d.name as Department,
        e.name as Employee,
        e.salary as Salary,
        dense_rank() over(partition by d.name order by e.salary desc) as ranking
    from Employee e
    left join Department d
    on e.departmentId = d.id
)
select Department , employee , Salary
from new_table 
where ranking  <= 3;