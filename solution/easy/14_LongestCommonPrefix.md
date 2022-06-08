14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

<!-- **Note:**  -->

**Example 1:**
```
Input: strs = ["flower","flow","flight"]
Output: "fl"
```

**Example 2:**
```
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
```

**Clarification:**
```
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.
```

## Solution:


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
        def longestCommonPrefix(self, strs: List[str]) -> str:
            
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
