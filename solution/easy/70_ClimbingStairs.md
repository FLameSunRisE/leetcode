70. Climbing Stairs

You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 

<!-- **Note:**  -->

**Example 1:**
```
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
```

**Example 2:**
```
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
```

**Clarification:**
```
0 <= x <= 231 - 1
```

## Solution:

從題目中可以掌握到此題的規律
- 題目範例
  - n = 3
    - 走一步 + 剩兩步 = 2
    - 走兩步 + 剩一步 = 1
    - 歸納:
      - Fn(3) = Fn(2) + Fn(1)
  - n = 4 
    - 走一步 + 剩三步 = 3
    - 走兩步 + 剩兩步 = 2
    - 歸納:
      - Fn(4) = Fn(3) + Fn(2)

- 透過遞迴處理 ```Fn(n) = Fn(n-1)+Fn(n-2)```
  - 答案: Time Limit Exceeded 超時

- DP (Bottom Up Approach)

- ChatGPT

  - 提供解法: 矩陣快速冪求解斐波那契數列
  - 解法:
    - pow:
      - pow 方法使用矩陣快速冪計算矩陣 base 的 exp 次方，並返回結果
      - 矩陣 base 是一個 2x2 的矩陣，用於表示斐波那契數列的遞推式。
      - 矩陣 res 是一個 2x2 的單位矩陣，用於存儲計算結果。
      - 使用 pow 方法計算斐波那契數列的第 n 項
    - multiply:
      - multiply 方法用於矩陣相乘
      - 計算矩陣 a 和矩陣 b 的乘積，並返回結果矩陣 c。

## code

- java
  - Code

    ```java
    class Solution {
      //  Time Limit Exceeded ==
      public int climbStairs(int n) {
        //  basic check
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        // Fibonacci : Fn(n) = Fn(n-1) + Fn(n-2)
        return climbStairs(n - 1) + climbStairs(n - 2);
      }

      // dp
      public int climbStairs2(int n){
        //  basic check
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
      }

      // 矩陣快速冪
      public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[][] base = {{1, 1}, {1, 0}};
        int[][] res = pow(base, n - 2);
        return 2 * res[0][0] + res[1][0];
      }

      private int[][] pow(int[][] base, int exp) {
          int[][] res = {{1, 0}, {0, 1}};
          while (exp > 0) {
              if ((exp & 1) == 1) {
                  res = multiply(res, base);
              }
              base = multiply(base, base);
              exp >>= 1;
          }
          return res;
      }

      private int[][] multiply(int[][] a, int[][] b) {
          int[][] c = new int[2][2];
          for (int i = 0; i < 2; i++) {
              for (int j = 0; j < 2; j++) {
                  c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
              }
          }
          return c;
      }
    }
    ```
