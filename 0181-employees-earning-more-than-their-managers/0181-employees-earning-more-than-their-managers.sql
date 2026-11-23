# Write your MySQL query statement below
select m.name as Employee from Employee e join Employee m  on e.id = m.managerid where m.salary > e.salary;