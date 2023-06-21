# [176. Second Highest Salary](https://leetcode.com/problems/second-highest-salary/)

- [176. Second Highest Salary](#176-second-highest-salary)
  - [Solution](#solution)
    - [解法一](#解法一)
    - [解法二](#解法二)

---

Table: Employee
+-------------+------+
| Column Name | Type |
+-------------+------+
| id | int |
| salary | int |
+-------------+------+
id is the primary key column for this table.
Each row of this table contains information about the salary of an employee.

Write an SQL query to report the second highest salary from the Employee table. If there is no second highest salary, the query should report null.

The query result format is in the following example.

**Example:**

```txt
Input:
Employee table:
+----+--------+
| id | salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+
Output:
+---------------------+
| SecondHighestSalary |
+---------------------+
| 200                 |
+---------------------+
```

**Example:**

```txt
Input:
Employee table:
+----+--------+
| id | salary |
+----+--------+
| 1  | 100    |
+----+--------+
Output:
+---------------------+
| SecondHighestSalary |
+---------------------+
| null                |
+---------------------+
```

## Solution

### 解法一

- 思路
  - 先找最高的薪水然後找比 Max 小的第二大數值
- code

  ```sql
  SELECT MAX(salary) AS SecondHighestSalary
  FROM Employee
  WHERE salary < (
    SELECT MAX(salary)
    FROM Employee
  );
  ```

### 解法二

- 思路
  - 透過 DISTINCT 取不重複的
  - 再透過 LIMIT 1 OFFSET 1 取得第二大的(OFFSET 位移一筆)
- code

  ```sql
  SELECT IFNULL(
    (SELECT DISTINCT salary
     FROM Employee
     ORDER BY salary DESC
     LIMIT 1 OFFSET 1),
    NULL) AS SecondHighest
  ```
