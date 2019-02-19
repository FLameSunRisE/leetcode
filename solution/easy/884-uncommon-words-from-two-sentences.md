# 884. Uncommon Words from Two Sentences

We are given two sentences`A`and`B`.  \(A_sentence_ is a string of space separated words.  Each_word_consists only of lowercase letters.\)

A word is_uncommon_ if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Return a list of all uncommon words. 

You may return the list in any order.



1. 
**Example 1:**

```
Input: 
A = 
"this apple is sweet"
, B = 
"this apple is sour"
Output: 
["sweet","sour"]
```

**Example 2:**

```
Input: 
A = 
"apple apple"
, B = 
"banana"
Output: 
["banana"]
```



**Note:**

1. `0 <= A.length <= 200`
2. `0 <= B.length <= 200`
3. `A`and`B`both contain only spaces and lowercase letters.



## Solution:

Step 1: Add A and B together

Step 2: Cut the string

Step 3: Use set\(\) to find out the number of each string. If it is equal to one, return it to ans.

## Code:

* python:

```py
class Solution:
    def uncommonFromSentences(self, A: 'str', B: 'str') -> 'List[str]':
        s = A + ' '+B
        s = s.split()
        ans = []
        for word in set(s):
            if s.count(word)==1:
                ans.append(word)
        return ans

```



