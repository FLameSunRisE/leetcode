# 409. Longest Palindrome

Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

- **Example 1:**

```
Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
```

- **Example 2:**

```
Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.
```

## Solution

- HashMap 來紀錄每個字元出現的次數
- 使用 for-each 迴圈遍歷 HashMap 中每個字元出現的次數
  - 該字元出現次數是偶數，就將其直接加到 len 中
  - 是奇數，就將其減去 1，再加到 len 中

## Code

- java

  - Code
    - 解法一:

      ```java
      class Solution {
        Map<Character, Integer> charMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        int len = 0;
        for (int i : charMap.values()) {
            if (i % 2 == 0) {
                len += i;
            } else {
                len += i - 1;
            }
        }
        return len < s.length() ? len + 1 : len;
      }
      ```

    - 解法二:
      - 首先遍歷給定字符串，對於每個字符，如果它已經存在於HashSet中，就將它的出現次數加1；
      - 如果不存在，就將它加入HashSet。
      - 接下來遍歷HashSet，計算每個字符出現次數的偶數部分，將它們的總和累加起來。
      - 如果存在奇數次出現的字符，那麼最後再把結果加1

      ```java
      public int maxProfit(int[] prices) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
                count++;
            } else {
                set.add(c);
            }
        }
        return set.isEmpty() ? count * 2 : count * 2 + 1;
      }
      ```
