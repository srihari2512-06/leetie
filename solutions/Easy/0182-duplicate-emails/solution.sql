-- ──────────────────────────────────────────────────
-- Problem  : 182. Duplicate Emails
-- Difficulty: Easy
-- Tags     : Database
-- Link     : https://leetcode.com/problems/duplicate-emails/
-- Runtime  : 387 ms (beats 70%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 srihari2512-06. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

# Write your MySQL query statement below
select email as email
from person
group by email 
having count(email) > 1;