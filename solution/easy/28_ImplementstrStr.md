28. Implement strStr()

Implement strStr().

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().


<!-- **Note:**  -->

**Example 1:**
```
Input: haystack = "hello", needle = "ll"
Output: 2
```

**Example 2:**
```
Input: haystack = "aaaaa", needle = "bba"
Output: -1
```

**Clarification:**
```
1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
```

## Solution:
- 解法一
  - 使用find method
- 解法二
  1. 基本檢核
  2. 從頭開始直接比對needle在目標字串是否相似

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
        def strStr(self, haystack: str, needle: str) -> int:
            return haystack.find(needle)
        # 解法二
        def strStr(self, haystack: str, needle: str) -> int:
            if len(needle) == 0:
                return 0
            for i in range(len(haystack)):
                if haystack[i:i+len(needle)] == needle:
                    return i
            return -1
    ```
