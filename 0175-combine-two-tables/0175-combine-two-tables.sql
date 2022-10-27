# Write your MySQL query statement below
select firstname , lastname , city , state 
from Person
left outer Join Address
On Person.personId = Address.personId