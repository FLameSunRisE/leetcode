# 784. Letter Case Permutation

Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.  Return a list of all possible strings we could create.

1. 
**Example :**

```
Examples:
Input: S = "a1b2"
Output: ["a1b2", "a1B2", "A1b2", "A1B2"]

Input: S = "3z4"
Output: ["3z4", "3Z4"]

Input: S = "12345"
Output: ["12345"]
```

**Note:**

S will be a string with length between 1 and 12.
S will consist only of letters or digits.

## Solution:

Given a string S, need to  transform every letter individually to be lowercase or uppercase to create another string.  

Using DFS solution:
reference : https://zxi.mytechroad.com/blog/searching/leetcode-784-letter-case-permutation/

## Code:

* python:

```py
class Solution:
    def letterCasePermutation(self, S) -> List[str]:
        ans = []
        def dfs(S, i, n):
            if i == n:
                ans.append(''.join(S))
                return
            dfs(S, i + 1, n)
            if not S[i].isalpha():
                return
            S[i] = chr(ord(S[i]) ^ (1 << 5))
            dfs(S, i + 1, n)
            S[i] = chr(ord(S[i]) ^ (1 << 5))
        dfs(list(S), 0, len(S))
        return ans
```



