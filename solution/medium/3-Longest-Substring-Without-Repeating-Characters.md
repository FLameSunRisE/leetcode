# [3. Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

- [3. Longest Substring Without Repeating Characters](#3-longest-substring-without-repeating-characters)
  - [Solution](#solution)
    - [解法一:](#解法一)
    - [解法二:](#解法二)

---

Given a string s, find the length of the longest
substring
without repeating characters.

**Example:**

```txt
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
```

**Example:**

```txt
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
```

**Example:**

```txt
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

**Constraints:**

```txt
0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
```

## Solution

### 解法一:

- 思路
  - 透過 hashMap 暫時儲存已經訪問的字
    - 當字串相同或已存在 map 中時,重新初始化變數
    - 不同,則存入 map
  - loop 結束後取最長之 char
- 步驟
  1. 基本檢核
  2. 初始化變數
  - 使用 HashMap 來暫存已經訪問過的字元
  - start: subString 開始位置
  - end: subString 結束位置
  - maxLength: 紀錄最長 subString 長度
  3. loop 字串
  - 判斷是否相等
    - 相等 : 將字串在 map 裡的開始位置更新至在位置
    - 不相等: 不做事
  - 更新 map
  - 計算 maxLength
    - Math.max(maxLength, end - start + 1)
  - end 往後推一格
  4.
- 效率
  - 時間複雜度：$O(n)$
    空間複雜度：$O(n)$
- code

  ```java
  class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        int start = 0;
        int end = 0;
        Map<Character, Integer> map = new HashMap<>();

        while (end < s.length()) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                start = Math.max(start, map.get(c) + 1);
            }
            map.put(c, end);
            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }
        return maxLength;
    }
  }
  ```

### 解法二:

- 思路
  - 初始化一個 HashSet，用來存儲當前窗口中的字符。
  - 定義兩個指針 left 和 right，分別指向窗口的左邊界和右邊界。
  - loop input 字串
    - 不包含
      - 加入 set 中，並更新 maxLength 為當前窗口的最大長度（即 right - left + 1）
    - 包含
      - 從 left 開始逐步移動左邊界 left++，直到找到與當前字符相同的字符。
      - 移除 set 中所有在 left 左側的字符，表示不再考慮這些字符的重複情況。
      - 將當前字符加入 set 中，表示新的窗口以當前字符為起點。
    - 直到結束返回 max 值
- 效率
  - 時間複雜度：$O(n)$
    空間複雜度：$O(n)$
- code

  ```java
  class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (!set.contains(c)) {
                set.add(c);
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (left < right && s.charAt(left) != c) {
                    set.remove(s.charAt(left));
                    left++;
                }
                if (left < right) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(c);
            }
        }

        return maxLength;
    }
  }
  ```
