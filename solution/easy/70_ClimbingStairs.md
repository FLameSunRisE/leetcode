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



## code:

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
    }
    ```
- python
    ```py
    class Solution:
        # 解法一
        
        # 解法二
    ```
