# Write your MySQL query statement below
Select 
product_name,
year,
price
From Sales s
Inner Join Product p 
ON s.product_id = p.product_id;