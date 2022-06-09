20. Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
<!-- **Note:**  -->

**Example 1:**
```
Input: s = "()"
Output: true
```

**Example 2:**
```
Input: s = "()[]{}"
Output: true
```

**Example 3:**
```
Input: s = "(]"
Output: false
```

**Clarification:**
```
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
```

## Solution:

1. 基本檢核去除奇數
2. 透過stack的機制遇到對應的dict就pop出來 反之繼續append

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
        def isValid(self, s: str) -> bool:
            stack = []
            dict = {"]": "[", "}": "{", ")": "("}
            for char in s:
                if char in dict.values():
                    stack.append(char)
                elif char in dict.keys():
                    if stack == [] or dict[char] != stack.pop():
                        return False
                else:
                    return False
            return stack == []
        # 解法二
    ```
