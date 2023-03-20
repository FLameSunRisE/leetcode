# 196. Delete Duplicate Emails

Table: Person

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| email       | varchar |
+-------------+---------+
id is the primary key column for this table.
Each row of this table contains an email. The emails will not contain uppercase letters.
 

Write an SQL query to delete all the duplicate emails, keeping only one unique email with the smallest id. Note that you are supposed to write a DELETE statement and not a SELECT one.

After running your script, the answer shown is the Person table. The driver will first compile and run your piece of code and then show the Person table. The final order of the Person table does not matter.

The query result format is in the following example.

**Example 1:**

```txt
Input: 
Person table:
+----+------------------+
| id | email            |
+----+------------------+
| 1  | john@example.com |
| 2  | bob@example.com  |
| 3  | john@example.com |
+----+------------------+
Output: 
+----+------------------+
| id | email            |
+----+------------------+
| 1  | john@example.com |
| 2  | bob@example.com  |
+----+------------------+
Explanation: john@example.com is repeated two times. We keep the row with the smallest Id = 1.
```

## Solution

- 解法1
  - 使用Not in, 透過group by撈取最小的
  - 但因不能使用select fail
- 解法2
  - [參考](https://leetcode.com/problems/delete-duplicate-emails/solutions/3142892/explanation-of-official-solution/?orderBy=hot)
    - 數據表自連接（self-join）的方式
      - 將Person表重命名為p1和p2兩個表，它們之間的連接條件是p1.Email = p2.Email
      - 使用了條件p1.Id > p2.Id
        - 只保留Id值較小的p1記錄，刪除其他p2記錄。

## code

- sql

  - Code
    - 解法1: fail

    ```sql
    DELETE FROM Person
    WHERE Id NOT IN (
        SELECT MIN(Id)
        FROM Person
        GROUP BY Email
    )
    ```

    - 解法2

    ```sql
    DELETE p1 FROM Person p1, Person p2
    WHERE p1.Email = p2.Email AND p1.Id > p2.Id
    ```