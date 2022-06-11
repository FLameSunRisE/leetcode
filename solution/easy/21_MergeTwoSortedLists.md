21. Merge Two Sorted Lists

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
<!-- **Note:**  -->

**Example 1:**
```
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
```

**Example 2:**
```
Input: list1 = [], list2 = []
Output: []
```

**Example 3:**
```
Input: list1 = [], list2 = [0]
Output: [0]
```

**Clarification:**
```
The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
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
