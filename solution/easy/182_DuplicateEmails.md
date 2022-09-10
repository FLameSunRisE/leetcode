# 182. Duplicate Emails

SQL Schema
Table: Person

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| email       | varchar |
+-------------+---------+
id is the primary key column for this table.
Each row of this table contains an email. The emails will not contain uppercase letters.
 

<!-- **Note:**  -->

**Example 1:**
```
Input: 
Person table:
+----+---------+
| id | email   |
+----+---------+
| 1  | a@b.com |
| 2  | c@d.com |
| 3  | a@b.com |
+----+---------+
Output: 
+---------+
| Email   |
+---------+
| a@b.com |
+---------+
Explanation: a@b.com is repeated two times.
```


## Solution:
- 解法:
找重複的email, 就下意識想使用```group by```來查詢是否有重複的。


## code:

- SQL

```sql
select Email from Person
group by Email
having count(*)>1;
```
