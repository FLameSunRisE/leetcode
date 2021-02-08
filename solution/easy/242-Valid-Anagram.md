# 242. Valid Anagram

Given two strings s and t , write a function to determine if t is an anagram of s.

**Example 1:**

```
Input: s = "anagram", t = "nagaram"
Output: true
```

**Example 2:**

```
Input: s = "rat", t = "car"
Output: false
```

**Note:**

You may assume the string contains only lowercase alphabets.

## Solution:

1. 先將兩個字串進行sort，再比對兩者

## Code:

* python:

```py3
class Solution:
        if sorted(s) == sorted(t):
            return True
        return False
```



