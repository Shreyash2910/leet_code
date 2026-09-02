# Write your MySQL query statement below
select 
e.name as name,
b.bonus as bonus
from Employee e
left join Bonus b
On e.empId = b.empId
Where b.bonus<1000 or b.bonus is Null;