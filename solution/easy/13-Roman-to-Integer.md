13. Roman to Integer


Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

```
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
```

For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

```
I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
```

<!-- **Note:**  -->

**Example 1:**
```
Input: s = "III"
Output: 3
Explanation: III = 3.
```

**Example 2:**
```
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
```

**Example 3:**
```
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
```

**Clarification:**
```
- 1 <= s.length <= 15
- s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
- It is guaranteed that s is a valid roman numeral in the range [1, 3999].
```

## Solution:

此題主要先透過dict去處理固定字串，接者依據條件判斷。
- Roman 條件:
  - largest to smallest from left to right
  - 六種減法情境 : 歸納出若當前位置小於下一格時期處理方式為先減後加

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
        def romanToInt(self, s: str) -> int:
            tmp = {'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000,}
            sum = 0
            for i in range(0, len(s) - 1):
                if tmp[s[i]] < tmp[s[i+1]]:
                    sum -= tmp[s[i]]
                else:
                    sum += tmp[s[i]]
            return z + tmp[s[-1]]
    ```
  <!-- 2. leetCode大神解法
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
   -->
