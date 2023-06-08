# [524. Longest Word in Dictionary through Deleting](https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/description/)

- [524. Longest Word in Dictionary through Deleting](#524-longest-word-in-dictionary-through-deleting)
  - [題目說明](#題目說明)
  - [Solution](#solution)
    - [解法一: 通過刪除原始字串獲得的最長單詞](#解法一-通過刪除原始字串獲得的最長單詞)

---

## 題目說明

Given a string s and a string array dictionary, return the longest string in the dictionary that can be formed by deleting some of the given string characters. If there is more than one possible result, return the longest word with the smallest lexicographical order. If there is no possible result, return the empty string.

**Example:**

```txt
Input: s = "abpcplea", dictionary = ["ale","apple","monkey","plea"]
Output: "apple"
```

**Example:**

```txt
Input: s = "abpcplea", dictionary = ["a","b","c"]
Output: "a"
```

<!-- **Example:**

```txt

``` -->

**Constraints:**

```txt
1 <= s.length <= 1000
1 <= dictionary.length <= 1000
1 <= dictionary[i].length <= 1000
s and dictionary[i] consist of lowercase English letters.
```

---

## Solution

### 解法一: 通過刪除原始字串獲得的最長單詞

- 思路
  - 對於每個字典中的單詞，進行以下處理：
    - 如果該單詞需要跳過（根據長度和字典序），則繼續下一個單詞。
    - 否則，檢查該單詞是否為原始字串的子序列，如果是則更新答案。
  - 使用兩個輔助方法 isSubsequence 和 shouldSkipWord 進行子序列判斷和跳過判斷。
    - isSubsequence: 子序列判斷
    - shouldSkipWord: 跳過邏輯判斷
- 效率
  - 時間複雜度：$O(n * m * k)$
    - n: 字典的大小
    - m: 最長單詞的長度
    - k: 原始字串的長度
  - 空間複雜度：O(1)$
- code

  ```java
  class Solution {
      public String findLongestWord(String s, List<String> dictionary) {
          String ans = "";
          for (String word : dictionary) {
              if (shouldSkipWord(word, ans)) {
                  continue;
              }
              if (isSubsequence(s, word)) {
                  ans = word;
              }
          }
          return ans;
      }

    /**
    * isSubsequence-判斷是否為s的子序列.
    *
    * @param s
    * @param word
    * @return boolean
    */
    private boolean isSubsequence(String s, String word) {
      int pos = -1;
      for (int i = 0; i < word.length(); i++) {
        pos = s.indexOf(word.charAt(i), pos + 1);
        if (pos == -1) {
          break;
        }
      }
      return pos != -1;
    }

    /**
    * shouldSkipWord-判斷是否需要跳過.
    *
    * @param word
    * @param ans
    * @return boolean
    */
    private boolean shouldSkipWord(String word, String ans) {
      int wordSize = word.length();
      int ansSize = ans.length();
      // 當前單詞的長度小於最長單詞的長度 || 長度相等但字典序小於最長單詞
      if (wordSize < ansSize || (wordSize == ansSize && word.compareTo(ans) > 0)) {
        return true;
      }
      return false;
    }
  }
  ```

<!-- ### 解法二:

- 思路
  -
- 效率
  - 時間複雜度：$O(n)$
    空間複雜度：$O(n)$
- code

  ```java
  class Solution {

  }
  ``` -->
