# 268. Missing Number

Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

**Example:**

```txt
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
```

**Example:**

```txt
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
```

**Example:**

```txt
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
```

**Constraints:**

```txt
n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique.
```

## Solution

### 排序(missingNumber_first)

- 解法:
  - 使用 Arrays.sort() 函數排序整數數組 nums。
  - 遍歷排序後的數組，查找缺失的數字。
  - 如果在位置 i 找到數字 i，則繼續遍歷；否則返回 i，
    - 因為缺失的數必須在 0 到 n 的範圍內，並且數組已排序。

- 時間複雜度：$O(nlogn)$
- 空間複雜度：$O(1)$

### 解法一：數學方法

- 將數列中所有的數字加總，再減去 1 到 n 的總和，剩下的數字即為缺失的數字。

- 時間複雜度：$O(n)$
- 空間複雜度：$O(1)$

### 解法二：位元運算

- 可以使用 XOR 運算，將 0 到 n 的所有數字以及數列中的所有數字進行 XOR 運算，留下的數字即為缺失的數字。

- Example

  ```txt
  當 n = 5，數列為 [0, 1, 3, 4, 5] 時，我們可以進行以下的運算：

  先計算 0 到 5 的所有數字的 XOR 運算結果：0 ^ 1 ^ 2 ^ 3 ^ 4 ^ 5 = 0b0110

  再將數列中的數字進行 XOR 運算：0 ^ 1 ^ 3 ^ 4 ^ 5 = 0b0111

  將以上兩個結果進行 XOR 運算，最後得到的數字即為缺失的數字：0b0110 ^ 0b0111 = 0b0001 = 1

  因此，此數列中缺失的數字為 2。
  ```

- 時間複雜度：$O(n)$
- 空間複雜度：$O(1)$

## Code

```java
class Solution {
    public int missingNumber_first(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return n;
    }

    // 解法一：數學方法
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int n = nums.length;
        return (n * (n + 1) / 2) - sum;
    }

    // 解法二：位元運算
    public int missingNumber(int[] nums) {
        int xor = 0;
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }
        return xor ^ i;
    }
}
```
