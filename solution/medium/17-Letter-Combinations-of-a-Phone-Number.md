# [17. Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)

- [17. Letter Combinations of a Phone Number](#17-letter-combinations-of-a-phone-number)
  - [Solution](#solution)
    - [解法一:](#解法一)
    - [解法二:](#解法二)

---

Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

**Example:**

```txt
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
```

**Example:**

```txt
Input: digits = ""
Output: []
```

**Example:**

```txt
Input: digits = "2"
Output: ["a","b","c"]
```

**Constraints:**

```txt
0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].
```

## Solution

### 解法一:

- 思路
  - 排除空值
  - 建立 phoneMap 表
  - 透過遞迴方式查找
    - 檢查條件
      - digits 跟 letters 是否相等, 相等則 return 並加入結果
      - currDigit : 當前處理的數字
      - 因此透過推移的方式一個一個進行排列組合
- 效率

  - 時間複雜度：$O(3^N × 4^M)$
    - N 是輸入 digits 中對應到字母數量為 3 的數字的個數
    - M 是對應到字母數量為 4 的數字的個數
  - 空間複雜度：$O(N + M)$
    - N 和 M 分別是對應到字母數量為 3 和 4 的數字的個數

- code

  ```java
  class Solution {
      List<String> result = new ArrayList<>();
      HashMap<Character, String> phoneMaps;
      public List<String> letterCombinations(String digits) {
          // 排除空值
          if (digits == null || digits.length() == 0) {
              return result;
          }
          // 建立map資料
          phoneMaps = givenPhoneMap();
          // 開始計算
          generateCombinations(digits, "", 0);
          return result;
      }

      private void generateCombinations(String digits, String letters, int idx) {
          if (digits.length() == letters.length()) {
              result.add(letters);
              return;
          }
          String currDigit = "";
          if (phoneMaps.containsKey(digits.charAt(idx))) {
              currDigit = phoneMaps.get(digits.charAt(idx));
          }
          for (int i = 0; i < currDigit.length(); ++i) {
              generateCombinations(digits, letters + currDigit.charAt(i), idx + 1);
          }
      }

      private HashMap<Character, String> givenPhoneMap() {
          HashMap<Character, String> phoneMap = new HashMap<>();
          phoneMap.put('2', "abc");
          phoneMap.put('3', "def");
          phoneMap.put('4', "ghi");
          phoneMap.put('5', "jkl");
          phoneMap.put('6', "mno");
          phoneMap.put('7', "pqrs");
          phoneMap.put('8', "tuv");
          phoneMap.put('9', "wxyz");
          return phoneMap;
      }
  }
  ```

### 解法二:

- ## 思路
- 效率
  - 時間複雜度：$O(n)$
    空間複雜度：$O(n)$
- code

  ```java
  class Solution {

  }
  ```
