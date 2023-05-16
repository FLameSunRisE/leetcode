# [66. Plus One](https://leetcode.com/problems/plus-one/)

- [66. Plus One](#66-plus-one)
  - [Solution](#solution)
    - [解法一: 由後往前處理](#解法一-由後往前處理)
    - [解法二: 優化解法 1 寫法](#解法二-優化解法-1-寫法)
    - [Leetcode 大神解法](#leetcode-大神解法)

---

You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

<!-- **Note:**  -->

**Example 1:**

```
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
```

**Example 2:**

```
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
```

**Example 3:**

```
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
```

**Clarification:**

```
1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.
```

## Solution

### 解法一: 由後往前處理

- 思路
  - 初始化 carray 變數
  - 透過 for loop 從後往前
    - 若 sum > 10 : keep going
    - 反之: 加總完直接 return
- 效率
  - 時間複雜度：$O(n)$
    空間複雜度：$O(n)$
- code

  ```java
  class Solution {
    private int[] plusOne_first(int[] digits) {
      int carry = 1;
      int length = digits.length;
      for (int i = length - 1; i >= 0; i--) {
        int sum = digits[i] + carry;
        if (sum < 10) {
          digits[i] = sum;
          return digits;
        } else {
          digits[i] = sum % 10;
          carry = 1;
        }
      }

      if (carry == 1) {
        int[] newDigits = new int[length + 1];
        newDigits[0] = 1;
        System.arraycopy(digits, 0, newDigits, 1, length);
        return newDigits;
      }
      return digits;
    }
  }
  ```

### 解法二: 優化解法 1 寫法

- 思路
  - 在計算 sum 跟餘數的過程直接先計算後再判斷
  - 可讀性提升
- 效率
  - 時間複雜度：$O(n)$
    空間複雜度：$O(n)$
- code

  ```java
  class Solution {

  }
  ```

### Leetcode 大神解法

1. bgautam1254

```java
for (int i = digits.length - 1; i >= 0; i--) {
	if (digits[i] < 9) {
		digits[i]++;
		return digits;
	}
	digits[i] = 0;
}

digits = new int[digits.length + 1];
digits[0] = 1;
return digits;
```
