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

1. 基本檢核, None && length =0
2. 透過紀錄prefix資訊 從頭到尾比一次
  - loop檢查時
    - 相同 : 檢查下一個
    - 不同 : 移除prefix尾端再重新檢查

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
        def longestCommonPrefix(self, strs: List[str]) -> str:
            if(strs is None or len(strs) == 0):
                return ""
            pre = strs[0]
            target = 1
            while (target < len(strs)):
                while strs[target].find(pre) != 0:
                    tmp = len(pre) - 1
                    pre = pre[:tmp]
                target += 1
            return pre
        # 解法二

        def longestCommonPrefix2(self, strs: List[str]) -> str:
            if(strs is None or len(strs) == 0):
                return ""
            prefix = strs[0]
            for i in range(1, len(strs)):
                while(strs[i].find(prefix) != 0):
                    prefix = prefix[:-1]
                    if len(prefix) == 0:
                        return ""
            return prefix

        # 大神寫法
        def longestCommonPrefix3(self, m):
            if not m:
                return ''
                # since list of string will be sorted and retrieved min max by alphebetic order
            s1 = min(m)
            s2 = max(m)
            print('s1:' + str(s1))
            print('s2:' + str(s2))

            for i, c in enumerate(s1):
                print('i:' + str(i), 'c:' + str(c))
                if c != s2[i]:
                    print('if ans:' + str(s1))
                    return s1[:i]  # stop until hit the split index
            print('ans:' + str(s1))
            return s1
            
    ```
