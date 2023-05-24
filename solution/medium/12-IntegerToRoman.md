# [12. Integer to Roman](https://leetcode.com/problems/integer-to-roman/)

- [12. Integer to Roman](#12-integer-to-roman)
  - [Solution](#solution)
    - [解法一:](#解法一)
    - [解法二:](#解法二)

---

oman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

```
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
```

For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

- I can be placed before V (5) and X (10) to make 4 and 9.
- X can be placed before L (50) and C (100) to make 40 and 90.
- C can be placed before D (500) and M (1000) to make 400 and 900.
  Given an integer, convert it to a roman numeral.

**Example:**

```txt
Input: num = 3
Output: "III"
Explanation: 3 is represented as 3 ones.
```

**Example:**

```txt
Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
```

**Example:**

```txt
Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
```

**Constraints:**

```txt
1 <= num <= 3999
```

## Solution

### 解法一:

- 思路
  - 先透過 Map 紀錄 int 與 roman symbol 的對應關係
  - 由大到小進行計算
    - 若 symbolMap 中的 value > num :
      - 先將 symbol 寫入結果中
      - 並將 num - 該 roman 的 value 大小
    - 反之
      - 因小於所以比較下一階段的 roman 數字
- 效率
  - 時間複雜度：$O(1)$
    - 整數範圍固定
  - 空間複雜度：$O(1)$
- code

  ```java
  class Solution {
    public String intToRoman(int num) {
        // 创建整数与罗马数字的对应关系表
        Map<Integer, String> symbolMap = new LinkedHashMap<>();
        symbolMap.put(1000, "M");
        symbolMap.put(900, "CM");
        symbolMap.put(500, "D");
        symbolMap.put(400, "CD");
        symbolMap.put(100, "C");
        symbolMap.put(90, "XC");
        symbolMap.put(50, "L");
        symbolMap.put(40, "XL");
        symbolMap.put(10, "X");
        symbolMap.put(9, "IX");
        symbolMap.put(5, "V");
        symbolMap.put(4, "IV");
        symbolMap.put(1, "I");

        StringBuilder roman = new StringBuilder();
        // 逐位转换整数为罗马数字
        for (Map.Entry<Integer, String> entry : symbolMap.entrySet()) {
            int value = entry.getKey();
            String symbol = entry.getValue();
            while (num >= value) {
                roman.append(symbol);
                num -= value;
            }
        }
        return roman.toString();
    }
  }
  ```

### 解法二:

- 思路
  - 透過四個區分個位數(個、十、百、千...)等羅馬數字，並將其寫入 array 中
  - 通過對 num 進行數學運算和取餘，依次取出對應的數字位上的值，然後通過陣列索引獲取對應的羅馬數字字元。
    - ths[num / 1000]
      表示獲取千位上的羅馬數字字元。通過將整數 num 除以 1000 取整，得到千位上的值作為陣列的索引，獲取對應的羅馬數字字元。
    - hrns[(num % 1000) / 100]
      表示獲取百位上的羅馬數字字元。通過將整數 num 對 1000 取餘後再除以 100，得到百位上的值作為陣列的索引，獲取對應的羅馬數字字元。
    - tens[(num % 100) / 10]
      表示獲取十位上的羅馬數字字元。通過將整數 num 對 100 取餘後再除以 10，得到十位上的值作為陣列的索引，獲取對應的羅馬數字字元。
    - ones[num % 10]
      表示獲取個位上的羅馬數字字元。通過將整數 num 對 10 取餘，得到個位上的值作為陣列的索引，獲取對應的羅馬數字字元。
- 效率
  - 時間複雜度：$O(1)$
    空間複雜度：$O(1)$
- code

  ```java
  class Solution {
    public String intToRoman(int num) {
      String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
      String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
      String[] hrns = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
      String[] ths = {"", "M", "MM", "MMM"};

      return ths[num / 1000] + hrns[(num % 1000) / 100] + tens[(num % 100) / 10] + ones[num % 10];
    }
  }
  ```
