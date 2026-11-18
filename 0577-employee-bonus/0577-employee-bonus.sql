# Write your MySQL query statement below
select name , bonus from employee left join bonus ON employee.empId = bonus.empId where bonus<1000 or bonus is null;