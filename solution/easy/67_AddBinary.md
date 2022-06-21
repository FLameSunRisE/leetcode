67. Add Binary

Given two binary strings a and b, return their sum as a binary string.
 

<!-- **Note:**  -->

**Example 1:**
```
Input: a = "11", b = "1"
Output: "100"
```

**Example 2:**
```
Input: a = "1010", b = "1011"
Output: "10101"
```

**Clarification:**
```
1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
```

## Solution:
- 解法一
  - 二進制轉十進制加完後再轉回二進制


## code:

<!-- - java
  - Code
    ```java
    class Solution {
    }
    ``` -->
- python
    ```py
    class Solution:
        # 解法一
        a = int(a, 2)
        b = int(b, 2)
        return bin(a+b)[2:]
        # 解法二
    ```
