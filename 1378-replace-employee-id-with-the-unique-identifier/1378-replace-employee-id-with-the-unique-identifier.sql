# Write your MySQL query statement below
select 
eu.unique_id as unique_id,
e.name as name
From Employees e
left join EmployeeUNI eu
ON e.id=eu.id;