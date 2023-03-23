# 171. Excel Sheet Column Number

Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

```txt
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
```

**Example:**

```txt
Input: columnTitle = "A"
Output: 1
```

**Example:**

```txt
Input: columnTitle = "AB"
Output: 28
```

**Example:**

```txt
Input: columnTitle = "ZY"
Output: 701
```

**Constraints:**

```txt
1 <= columnTitle.length <= 7
columnTitle consists only of uppercase English letters.
columnTitle is in the range ["A", "FXSHRXW"].
```

## Solution

- 觀察題型:
  - 將每個字母視為一個26進制的數位，從右到左遍歷字符串
  - 將每個數位乘上相應的權重，然後加總得到最終結果
  - Example
      -對於字符串 "AB"，我們可以將其解釋為 1 26^1 + 2 26^0 = 28，即對應的列號為28

- 解法:
  - forloop s 並針對每個字元c 轉換為10進制
  - 再配合公式進行計算結果

    ```math
    result += num * 26^k
    ```

## Code

- java
  - 說明:

    ```java
    /*
    例如，对于列名 "ABC"，其对应的数字可以通过以下方式计算得出：
    result = (1 * Math.pow(26, 2)) + (2 * Math.pow(26, 1)) + (3 * Math.pow(26, 0))
    */
    char c = columnTitle.charAt(i);
    /*
    是将字符 c 转换为对应的数值，
    其中 'A' 表示字符 A 对应的 ASCII 码值，
    而 +1 是因为题目要求 A 对应的数字为 1，B 对应的数字为 2，以此类推。
    */
    result += num * Math.pow(26, n - i - 1);
    ```

```java
class Solution {
    public static int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int result = 0;
        for (int i = 0; i < n; i++) {
            char c = columnTitle.charAt(i);
            int num = c - 'A' + 1;
            result += num * Math.pow(26, n - i - 1);
        }
        return result;
    }
}
```
