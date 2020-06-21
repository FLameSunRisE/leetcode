# 893.Groups of Special-Equivalent Strings

You are given an array`A`of strings.

Two strings`S`and`T`are _special-equivalent_ if after any number of_moves_, S == T.

A\_move\_consists of choosing two indices`i`and`j`with`i % 2 == j % 2`, and swapping`S[i]`with`S[j]`.

Now, a_group of special-equivalent strings from_`A` is a non-empty subset S of`A` such that any string not in S is not special-equivalent with any string in S.

Return the number of groups of special-equivalent strings from`A`.

## Solution:

The first idea after reading this question is to use set function, but you need to do swapping before, so you must first distinguish the letters of even and odd and then sort them. Finally, you can find the answer through set.
`
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


