# 893.Groups of Special-Equivalent Strings

You are given an array`A`of strings.

Two strings`S`and`T`are _special-equivalent_ if after any number of_moves_, S == T.

A_move_consists of choosing two indices`i`and`j`with`i % 2 == j % 2`, and swapping`S[i]`with`S[j]`.

Now, a_group of special-equivalent strings from`A`_ is a non-empty subset S of`A` such that any string not in S is not special-equivalent with any string in S.

Return the number of groups of special-equivalent strings from`A`.



## Solution:

這題看完第一個想法是用set function，但在之前需先進行swapping，所以須先區分even 和 odd 的字母再來進行排序，最後就可以透過set找出答案了。

## Code:

* python

```py
class Solution:
    def numSpecialEquivGroups(self, A: 'List[str]') -> 'int':
        s = set()
        for char in A:
            odd = ""
            even = ""
            for i, c in enumerate(char):
                if i % 2 == 0:
                    odd += c
                else:
                    even += c
            s.add(''.join(sorted(odd) + sorted(even)))
        return len(s)

```

* 



