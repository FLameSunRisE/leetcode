# [58. Length of Last Word](https://leetcode.com/problems/length-of-last-word/description/)

- [58. Length of Last Word](#58-length-of-last-word)
  - [Solution](#solution)
    - [解法一:](#解法一)
    - [解法二:](#解法二)
  - [Python](#python)
    - [解法](#解法)

---

Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
consisting of non-space characters only.

**Example:**

```txt
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
```

**Example:**

```txt
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
```

**Example:**

```txt
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
```

**Constraints:**

```txt
1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
```

## Solution

### 解法一:

- 思路
  - 檢查基本判斷(空值)
  - 透過 split 分割成陣列並取最後一筆
- 效率
  - 時間複雜度：$O(n)$
    空間複雜度：$O(n)$
- code

  ```java
  class Solution {
    public int lengthOfLastWord(String s) {
        if (s.isEmpty() || s.equals(" ")){
            return 0;
        }
        String[] words = s.split(" ");
        String lastWord = words[words.length - 1];
        return lastWord.length();
    }
  }
  ```

### 解法二:

- 思路
  - 先 trim 掉尾部空格
  - 由後往前找到最後一個 word 結束位置(起點)
  - 計算長度
- 效率
  - 時間複雜度：$O(n)$
    空間複雜度：$O(n)$
- code

  ```java
  class Solution {
    public int lengthOfLastWord(String s) {
        // 先去除字串尾部的空格
        String trimmed = s.trim();
        int length = trimmed.length();

        // 從字串尾部向前遍歷，找到最後一個單詞的結束位置
        int end = length - 1;
        while (end >= 0 && trimmed.charAt(end) != ' ') {
            end--;
        }

        // 計算最後一個單詞的長度並返回
        return length - 1 - end;
    }
  }
  ```

## Python

### 解法

```py
class Solution:
    # 解法一
    word_list = s.split()
    return len(word_list[-1])
```
