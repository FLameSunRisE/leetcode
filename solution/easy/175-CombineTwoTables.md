# [175. Combine Two Tables](https://leetcode.com/problems/combine-two-tables/)

SQL Schema
Table: Person

+-------------+---------+
| Column Name | Type |
+-------------+---------+
| personId | int |
| lastName | varchar |
| firstName | varchar |
+-------------+---------+
personId is the primary key column for this table.
This table contains information about the ID of some persons and their first and last names.

Table: Address

+-------------+---------+
| Column Name | Type |
+-------------+---------+
| addressId | int |
| personId | int |
| city | varchar |
| state | varchar |
+-------------+---------+
addressId is the primary key column for this table.
Each row of this table contains information about the city and state of one person with ID = PersonId.

Write an SQL query to report the first name, last name, city, and state of each person in the Person table. If the address of a personId is not present in the Address table, report null instead.

Return the result table in any order.

The query result format is in the following example.

**Example:**

```txt
Input:
Person table:
+----------+----------+-----------+
| personId | lastName | firstName |
+----------+----------+-----------+
| 1        | Wang     | Allen     |
| 2        | Alice    | Bob       |
+----------+----------+-----------+
Address table:
+-----------+----------+---------------+------------+
| addressId | personId | city          | state      |
+-----------+----------+---------------+------------+
| 1         | 2        | New York City | New York   |
| 2         | 3        | Leetcode      | California |
+-----------+----------+---------------+------------+
Output:
+-----------+----------+---------------+----------+
| firstName | lastName | city          | state    |
+-----------+----------+---------------+----------+
| Allen     | Wang     | Null          | Null     |
| Bob       | Alice    | New York City | New York |
+-----------+----------+---------------+----------+
Explanation:
There is no address in the address table for the personId = 1 so we return null in their city and state.
addressId = 1 contains information about the address of personId = 2.
```

## Solution

### 解法一:LEFT JOIN

- code

```sql
SELECT Person.FirstName, Person.LastName, Address.City, Address.State
FROM Person LEFT JOIN Address ON Person.personId  = Address.personId ;
```

### 解法二:UNION

因为它使用了两个独立的 SELECT 语句，而不是单个 SELECT 语句中的 JOIN 操作。在某些情况下，使用 UNION 或者 EXISTS 子查询来代替 JOIN 操作，可以获得更好的性能表现。

- code

```sql
SELECT p.firstName, p.lastName, a.city, a.state from Person p, Address a
WHERE p.personId = a.personId
UNION
SELECT  p.firstName, p.lastName, null, null from Person p
WHERE p.personId NOT IN (Select personId from Address);
```
