# 859. Buddy Strings

Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.

Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].

For example, swapping at indices 0 and 2 in "abcd" results in "cbad".

**Example 1:**

```txt
Input: s = "ab", goal = "ba"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.
```

**Example 2:**

```txt
Input: s = "ab", goal = "ab"
Output: false
Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.
```

**Example 3:**

```txt
Input: s = "aa", goal = "aa"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.
```

**Clarification:**

```txt
1 <= s.length, goal.length <= 2 * 104
s and goal consist of lowercase letters.
```

## Solution

### 解法一

- 說明
  - 長度不相等回傳false
  - 若兩個字串相同,只需確認其中一個字串是否有重複的字母,就可以交換重複的字使之相等
  - 不相等時透過two-point方法紀錄前面兩個不同的字
    - 若只有一個則回傳false, 因為無法交換
    - 若兩個則需要滿足題目給的條件i!=j, s1[i] = s2[j] 且 s1[j] = s2[i]

- 時間複雜度：$O(n)$
- 空間複雜度：$O(n)$

  ```java
  class Solution {
        public boolean buddyStrings(String s, String goal) {
            if (s.length() != goal.length()) {
                return false;
            }
            // 如果两个字符串相等，则需要检查其中是否有重复字符
            if (s.equals(goal)) {
                // 用来记录每个字母出现的次数
                Set<Character> set = new HashSet<>();
                for (char c : s.toCharArray()) {
                    if (set.contains(c)) {
                        return true;
                    } else {
                        set.add(c);
                    }
                }
                return false;
            }

            // 查找需要交换的字符的位置
            int first = -1, second = -1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    if (first == -1) {
                        first = i;
                    } else if (second == -1) {
                        second = i;
                    } else {
                        return false;
                    }
                }
            }

            // 如果只有一对需要交换的字符，则无法通过交换字符使得两个字符串相等
            if (second == -1) {
                return false;
            }

            // 检查需要交换的字符是否能使得两个字符串相等
            return s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first);
        }
    }
  ```
