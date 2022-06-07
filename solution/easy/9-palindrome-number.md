# 9. Palindrome Number

Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
 

**Note:** A leaf is a node with no children.

**Example 1:**
```
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
```

**Example 2:**
```
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
```

**Example 3:**
```
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
```

**Clarification:**
```
-231 <= x <= 231 - 1
```

## Solution:

此題主要確認是否為回文，第一眼看到時變想要透過頭尾比對來判斷，於是出現了python

## code:

- java
  - 解題思路
  - Code
    ```java
    class Solution {
    }
    ```
- python
  1. 頭尾比對
    ```py
    class Solution:
        def isPalindrome(self, x: int) -> bool:
            tmp = str(x)
            for i in range(len(tmp)):
                if(tmp[i] != tmp[len(tmp)-1-i]):
                    return False
            return True
    ```
  2. leetCode大神解法
    - 解法:
    ```
    Example, if x = 15951, then let's create reverse of x in loop. Initially, x = 15951, revX = 0
    x = 1595, revX = 1
    x = 159, revX = 15
    x = 15, revX = 159
    ```

  ```py
    class Solution:
        def isPalindrome(self, x: int) -> bool:
            # if x is negative, return False.
            # if x is positive and last digit is 0,that also cannot form a palindrome, return False.
            if x < 0 or (x > 0 and x%10 == 0):
                return False
            
            result = 0
            while x > result:
                result = result * 10 + x % 10
                x = x // 10
                
            return True if (x == result or x == result // 10) else False
    ```
  


- REF
    - [
Python 3 -> 1 solution is 89.20% faster. 2nd is 99.14% faster. Explanation added](https://leetcode.com/problems/palindrome-number/discuss/785314/Python-3-greater-1-solution-is-89.20-faster.-2nd-is-99.14-faster.-Explanation-added)
