-- ──────────────────────────────────────────────────
-- Problem  : 586. Customer Placing the Largest Number of Orders
-- Difficulty: Easy
-- Tags     : Database
-- Link     : https://leetcode.com/problems/customer-placing-the-largest-number-of-orders/
-- Runtime  : 1137 ms (beats 5%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 srihari2512-06. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

# Write your MySQL query statement below
select customer_number
from Orders
group by customer_number
order by COUNT(Order_number) desc
limit 1