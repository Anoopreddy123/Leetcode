# Write your MySQL query statement below


select Distinct(P.Email) from Person P Join Person P1 on P.email = P1.email and P.id <> P1.id;