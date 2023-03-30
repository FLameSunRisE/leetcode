# 1002. Find Common Characters

Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.

**Example 1:**

```txt
Input: words = ["bella","label","roller"]
Output: ["e","l","l"]
```

**Example 2:**

```txt
Input: words = ["cool","lock","cook"]
Output: ["c","o"]
```

**Clarification:**

```txt
1 <= words.length <= 100
1 <= words[i].length <= 100
words[i] consists of lowercase English letters.
```

## Solution

### 解法一

- 說明

  - charCount:
    - 初始化值為 Integer.MAX_VALUE
    - 為了在取共同出現的字母的最小值時方便處理
  - currCharCount:紀錄當前字串中每個字母出現的次數

    - 將其與 charCount 中記錄的對應字母出現次數取最小值
    - 保證 charCount 中記錄的每個字母出現的次數都是所有字串中共同出現的最小值

  - Example:
    - "hello" 和 "leetcode"，找出兩個字串中共同出現的字元。
    - hello

      ```txt
      h: 1
      e: 1
      l: 2
      o: 1
      ```

    - leetcode

      ```txt
      l: 1
      e: 3
      t: 1
      c: 1
      o: 1
      d: 1
      ```

    - 要比較每個字元在兩個字串中出現的次數 : 取得較小值

      ```txt
      h: 0
      e: 1
      l: 1
      o: 1
      t: 0
      c: 0
      d: 0
      ```

- 時間複雜度：$O(N*M)$
- 空間複雜度：$O(1)$

  ```java
  class Solution {
    public List<String> commonChars(String[] A) {
        List<String> res = new ArrayList<>();
        int[] charCount = new int[26]; // 用來記錄每個字元出現的次數
        Arrays.fill(charCount, Integer.MAX_VALUE); // 先填入一個極大值，方便之後取最小值

        for (String word : A) {
            int[] currCharCount = new int[26]; // 用來記錄當前字串中每個字元出現的次數
            for (char c : word.toCharArray()) {
                currCharCount[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                charCount[i] = Math.min(charCount[i], currCharCount[i]); // 取最小值
            }
        }

        for (int i = 0; i < 26; i++) {
            while (charCount[i]-- > 0) {
                res.add(String.valueOf((char) ('a' + i))); // 將結果轉換為字元並加入結果列表
            }
        }

        return res;
    }
  }
  ```
