# [28. Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)

- [28. Find the Index of the First Occurrence in a String](#28-find-the-index-of-the-first-occurrence-in-a-string)
  - [Solution](#solution)
    - [解法一:](#解法一)
    - [解法二: two-point](#解法二-two-point)

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

**Example:**

```txt
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
```

**Example:**

```txt
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
```

<!-- **Example:**

```txt

``` -->

**Constraints:**

```txt
1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
```

## Solution

### 解法一:

- 思路
  - 排除 needle 為 0 的情形
    - 因空字串是任何字串的子串
  - 計算最大比對範圍
    - 減少後段比較成本
  - loop 比對是否相同
- 效率
  - 時間複雜度：O((n - m) \* m)
    空間複雜度：O(1)
- code

  ```java
  class Solution {
    public int strStr_first(String haystack, String needle) {
        if (needle.isEmpty()) {
          return 0;
        }

        int haystackLength = haystack.length();
        int needleLength = needle.length();
        int max = haystackLength - needleLength;

        for (int i = 0; i <= max; i++) {
          if (haystack.substring(i, i + needleLength).equals(needle)) {
            return i;
          }
        }

        return -1;
      }
  }
  ```

### 解法二: two-point

- 思路
  - 初始化兩個指針，一個指向 haystack 的當前字符，另一個指向 needle 的當前字符
  - 遍歷 haystack，並與 needle 的當前字符進行比較
    - 相等，則繼續比較下一個字符
    - 不相等，則將 haystack 的指針往前移動一位並重新開始比較
- 效率
  - 時間複雜度： O((n - m) \* m)
    - n 是 haystack 的長度
    - m 是 needle 的長度
      空間複雜度：O(1)
- code

  ```java
  class Solution {
    public static int findFirstOccurrence(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m > n) {
            return -1;
        }

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i;
            }
        }

        return -1;
    }
  }
  ```
