-- ──────────────────────────────────────────────────
-- Problem  : 182. Duplicate Emails
-- Difficulty: Easy
-- Tags     : Database
-- Link     : https://leetcode.com/problems/duplicate-emails/
-- Runtime  : 408 ms (beats 53%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 srihari2512-06. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

# Write your MySQL query statement below
select email from Person
group by email
having count(email)>1;