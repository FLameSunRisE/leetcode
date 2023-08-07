# [38. Count and Say](https://leetcode.com/problems/count-and-say/)

- [38. Count and Say](#38-count-and-say)
  - [Solution](#solution)
    - [解法一:](#解法一)
    - [解法二:](#解法二)

---

The count-and-say sequence is a sequence of digit strings defined by the recursive formula:

countAndSay(1) = "1"
countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
To determine how you "say" a digit string, split it into the minimal number of substrings such that each substring contains exactly one unique digit. Then for each substring, say the number of digits, then say the digit. Finally, concatenate every said digit.

For example, the saying and conversion for digit string "3322251":

![countandsay](https://assets.leetcode.com/uploads/2020/10/23/countandsay.jpg)

Given a positive integer n, return the nth term of the count-and-say sequence.

---

**Example:**

```txt
Input: n = 1
Output: "1"
Explanation: This is the base case.
```

**Example:**

```txt
Input: n = 4
Output: "1211"
Explanation:
countAndSay(1) = "1"
countAndSay(2) = say "1" = one 1 = "11"
countAndSay(3) = say "11" = two 1's = "21"
countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
```

**Constraints:**

```txt
1 <= n <= 30
```

## Solution

### 解法一:

- 思路
  - 迭代的方式來計算第 n 項的報數序列
  - 初始化報數序列為 "1"，從 n=2 開始，進行 n-1 輪迭代計算
  - 每一輪迭代過程，都根據前一項的報數序列 result 來生成下一項的報數序列 nowStr。
  - 在迭代過程中，使用左指針和右指針來找到連續重複數字的區間，計算重複數字的數量，然後拼接到新的報數序列中。
- 效率
  - 時間複雜度：$O(n \cdot 2^n)$
    - 每次皆需要 loop resul 的字串長度，因此為 $O(2^n)$
    - 且進行 n-1 次 loop 所以總時間為 $O(n \cdot 2^n)$
  - 空間複雜度：$O(2^n)$
    - 使用儲存 nowStr 來記錄每次生成的序列
    - max 長度為 nowStr 的兩倍長
- code

  ```java
  class Solution {
    public String countAndSay(int n) {
        // 當 n=1 時，直接返回 "1"，為起始序列
        if (n == 1) {
            return "1";
        }

        // 起始序列為 "1"
        String result = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder nowStr = new StringBuilder(); // 用來存儲新的報數序列

            int left = 0; // 左指針，指向連續重複數字的開始位置
            int right = 0; // 右指針，指向連續重複數字的結束位置

            // 遍歷前一項的報數序列 result
            while (right < result.length()) {
                // 移動右指針，找到連續重複數字的結束位置
                while (right < result.length() && result.charAt(left) == result.charAt(right)) {
                    right++;
                }

                // 計算連續重複數字的數量
                int count = right - left;

                // 拼接重複數字的數量和該數字本身，添加到新的報數序列 nowStr 中
                nowStr.append(count).append(result.charAt(left));

                // 移動左指針，指向下一組連續重複數字的開始位置
                left = right;
            }

            // 更新 result 為新的報數序列，繼續下一輪報數過程
            result = nowStr.toString();
        }

        // 返回第 n 項的報數序列
        return result;
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
