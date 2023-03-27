# 2549. Count Distinct Numbers on Board

You are given a positive integer n, that is initially placed on a board. Every day, for 109 days, you perform the following procedure:

For each number x present on the board, find all numbers 1 <= i <= n such that x % i == 1.
Then, place those numbers on the board.
Return the number of distinct integers present on the board after 109 days have elapsed.

Note:

Once a number is placed on the board, it will remain on it until the end.
% stands for the modulo operation. For example, 14 % 3 is 2.

<!-- **Note:**  -->

**Example 1:**

```txt
Input: n = 5
Output: 4
Explanation: Initially, 5 is present on the board.
The next day, 2 and 4 will be added since 5 % 2 == 1 and 5 % 4 == 1.
After that day, 3 will be added to the board because 4 % 3 == 1.
At the end of a billion days, the distinct numbers on the board will be 2, 3, 4, and 5.
```

**Example 2:**

```txt
Input: n = 3
Output: 2
Explanation:
Since 3 % 2 == 1, 2 will be added to the board.
After a billion days, the only two distinct numbers on the board are 2 and 3.
```

**Clarification:**

```txt
1 <= n <= 100
```

## Solution

### 解法一

- 說明

  - 一開始排除等於 1 的值
  - 在 forloop 避開 i,j = 0 的情形, 因為 0 % 1 會噴錯
  - 最後若 i % j == 1 則寫入 set 中
  - return set 數量

- 時間複雜度：$O(n^2)$
- 空間複雜度：$O(n)$

    ```java
    class Solution {
      public int distinctIntegers(int n) {
        Set<Integer> storeSet = new HashSet<>();
          if (n == 1) {
            return 1;
          }
          for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
              if (i % j == 1) {
                storeSet.add(j);
              }
            }
          }
          return storeSet.size();
      }
    }
    ```

### 解法二(ChatGpt)

一種優化方法是，觀察到當 $i$ 增加 1 時，$i$ 和 $i-1$ 之間只有一個數與 $i$ 滿足 $i,\mathrm{mod},j = 1$，這個數就是 $i-1$。因此，可以利用這個性質來減少不必要的運算。具體來說，對於每個 $i$，只需要找到 $i-1$ 和滿足 $i,\mathrm{mod},j = 1$ 的 $j$ 即可。這樣可以把時間複雜度減少到 $O(n\log n)$。

這個解法首先遍歷每個 $i$，然後從 $i-1$ 開始向下搜索滿足 $i,\mathrm{mod},j = 1$ 的 $j$，直到 $j=0$ 或 $i,\mathrm{mod},j \neq 1$ 為止。這樣可以確保找到所有符合條件的 $j$，並把它們放入集合中。最後返回集合大小加 1（因為 1 也是一個符合條件的數）。

- 運算過程

```txt
以下是一个 n = 5 的例子：

对于 x = 1，需要找到所有满足 x % i == 1 且 i > 1 的 i 值：

  当 i = 2 时，1 % 2 = 1，符合条件，需要在棋盘上加上数字 2；
  当 i = 3 时，1 % 3 = 1，符合条件，需要在棋盘上加上数字 3；
  当 i = 4 时，1 % 4 = 1，符合条件，需要在棋盘上加上数字 4；
  当 i = 5 时，1 % 5 = 1，符合条件，需要在棋盘上加上数字 5。
对于 x = 2，需要找到所有满足 x % i == 1 且 i > 1 的 i 值：

  当 i = 3 时，2 % 3 = 2，符合条件，需要在棋盘上加上数字 3；
  当 i = 4 时，2 % 4 = 2，符合条件，需要在棋盘上加上数字 4；
  当 i = 5 时，2 % 5 = 2，符合条件，需要在棋盘上加上数字 5。
对于 x = 3，需要找到所有满足 x % i == 1 且 i > 1 的 i 值：

  当 i = 4 时，3 % 4 = 3，符合条件，需要在棋盘上加上数字 4；
  当 i = 5 时，3 % 5 = 3，符合条件，需要在棋盘上加上数字 5。
对于 x = 4，需要找到所有满足 x % i == 1 且 i > 1 的 i 值：

  当 i = 5 时，4 % 5 = 4，符合条件，需要在棋盘上加上数字 5。
对于 x = 5，没有符合条件的 i 值，不需要在棋盘上加数字。

最终，棋盘上出现的数字为 2、3、4、5，一共 4 个数字，因此返回 4。
```

- 時間複雜度：$O(n\log n)$
- 空間複雜度：$O(n)$

  ```java
      class Solution {
        public int distinctIntegers_chatgpt(int n) {
          if (n == 1) {
              return 1;
          }
          Set<Integer> storeSet = new HashSet<>();
          for (int i = 2; i <= n; i++) {
              int j = i - 1;
              while (j > 0 && (i % j) == 1) {
                  storeSet.add(j);
                  j = j - 1;
              }
          }
          return storeSet.size() + 1;
        }
   }
  ```

### 解法三(ChatGpt)

- 說明

  - 要求找到所有滿足`x % i == 1` 的 `i`，並把這些 `i` 放到棋盤上。
  - 對於每個數 x，當 `i=1` 時，`x % i` 恆為 0，所以不需要考慮 `i=1` 的情況。
  - 因此，我們需要找到所有滿足`x % i == 1` 且 `i > 1`的 `i`值，這裡 `i > 1`中的 １是棋盤上的數字。
  - 所以在計算`x % i` 時，我們需要將 `i` 加 1。

  - 例如，對於 `x=2`，要找到所有滿足`x % i == 1` 且 `i > 1` 的 i 值，計算方式為：
    - 當 `i=2` 時， `2 % 2 = 0` 不符合條件；
    - 當 `i=3` 時， `2 % 3 = 2` 符合條件。
      因此，我們需要在棋盤上加上數字 3。

- 計算過程

  ```txt
  Day 0: 1
  Day 1: 2 (1%1+1=2)
  Day 2: 2, 3 (2%1+1=2, 2%2+1=3)
  Day 3: 2, 3, 4 (2%1+1=2, 2%2+1=3, 3%3+1=4)
  Day 4: 2, 3, 4, 5 (2%1+1=2, 2%2+1=3, 3%3+1=4, 2%4+1=3, 5%5+1=6)
  Day 5: 2, 3, 4, 5, 6 (2%1+1=2, 2%2+1=3, 3%3+1=4, 2%4+1=3, 5%5+1=6, 2%6+1=3, 3%6+1=4)
  ```

```java
class Solution {
  public int distinctIntegers_chatgpt(int n) {
    return n == 1 ? 1 : n - 1;
  }
}
```

- 時間複雜度：$O(1)$
- 空間複雜度：$O(1)$
