# 500. Keyboard Row

Given a List of words, return the words that can be typed using letters of**alphabet**on only one row's of American keyboard like the image below.



![](https://assets.leetcode.com/uploads/2018/10/12/keyboard.png)

**Example:**

```
Input:
 ["Hello", "Alaska", "Dad", "Peace"]

Output:
 ["Alaska", "Dad"]

```

**Note:**

1. You may use one character in the keyboard more than once.
2. You may assume the input string will only contain letters of alphabet. 

## Solution:

This problem is intended to be solved by set, through the set to determine whether the Input word is in a column, so as long as there is a match in one of the columns will be append to the answer.

## Code:

* python

```py
class Solution:
    def findWords(self, words: 'List[str]') -> 'List[str]':
        a = set('qwertyuiop')
        b = set('asdfghjkl')
        c = set('zxcvbnm')
        ans = []
        for word in words:
            loWordList = set(word.lower())
            if set(a) - (set(a) - set(loWordList)) == loWordList:
                ans.append(word)
            if set(b) - (set(b) - set(loWordList)) == loWordList:
                ans.append(word)
            if set(c) - (set(c) - set(loWordList)) == loWordList:
                ans.append(word)
        return ans
```

* 


