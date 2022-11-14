# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below

DELETE FROM Person
WHERE id NOT IN (
   select id 
    from (select min(id) as id , email 
          from Person group by email 
          order by id) i
)
# delete from Person
# where id not in (
#                 select id 
#                 from
#                     (select min(id) as Id,Email
#                     from Person
#                     group by Email
#                     order by Id) i
#                 )            
