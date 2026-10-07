-- ──────────────────────────────────────────────────
-- Problem  : 183. Customers Who Never Order
-- Difficulty: Easy
-- Tags     : Database
-- Link     : https://leetcode.com/problems/customers-who-never-order/
-- Runtime  : 614 ms (beats 50%)
-- Memory   : 0B (beats 100%)
-- Language : mysql
-- Copyright: (c) 2026 srihari2512-06. All rights reserved.
-- Synced by: leetie
-- ──────────────────────────────────────────────────

select name as Customers
from Customers
where id not in (
    select customerId
    from Orders
);