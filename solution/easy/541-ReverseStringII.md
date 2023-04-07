# [541. Reverse String II](https://leetcode.com/problems/reverse-string-ii/)

Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

**Example:**

```txt
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
```

**Example:**

```txt
Input: s = "abcd", k = 2
Output: "bacd"
```

**Constraints:**

```txt
1 <= s.length <= 104
s consists of only lowercase English letters.
1 <= k <= 104
```

## Solution

### 解法一

- 思路
  - 使用two-point
  - 透過loop 並且是以2*k的間格前進
    - 當i,j相遇或是 i超過2*k時則要跳出loop
- 效率
  - 時間複雜度：$O(n)$
  - 空間複雜度：$O(n)$
- code

```java
class Solution {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        for (int i = 0; i < n; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}
```

## 解法二:排序

- 思路
  - 

- 效率
  - 時間複雜度：O(NlogN)
    空間複雜度：O(1)

- code

```java

```
