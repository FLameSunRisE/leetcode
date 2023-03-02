# [392. Is Subsequence](https://leetcode.com/problems/is-subsequence/?envType=study-plan&id=level-1)

## Question

Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

## Case

Example 1:

```txt
Input: s = "abc", t = "ahbgdc"
Output: true
```

Example 2:

```txt
Input: s = "axc", t = "ahbgdc"
Output: false
```

## Solution

可以用雙指針的方法來解題。
分別用指針i和j指向s和t的起始位置。

- 當s.charAt(i) == t.charAt(j)時，就把指針i和j都向前移動一位
- 否則，只把t的指針j向前移動一位。當指針i移動到了s的末尾，就表示s是t的子序列，否則不是。

## Code

- [Java](../../java/leetcode/src/main/dp/IsSubsequence392.java)

    ```java

    ```
