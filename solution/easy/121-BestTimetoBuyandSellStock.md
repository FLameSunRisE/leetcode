# 121. Best Time to Buy and Sell Stock

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

- **Example 1:**

```
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
```

- **Example 2:**

```
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
```

## Solution

如下

## Code

- java

  - Code
    - 解法一:
      逐一比對取最大,但會發生 Time Limit Exceeded 。 因時間複雜度為O(n^2)

      ```java
      class Solution {
        public int maxProfit(int[] prices) {
            int max = 0;
            for (int i = 0; i < prices.length; i++) {
                int curIndex = i + 1;
                int tmpProfit = 0;
                for (int j = curIndex; j < prices.length; j++) {
                  int countProfit = prices[j] - prices[i];
                  if (tmpProfit < countProfit){
                      tmpProfit = countProfit;
                  }
                }
                if (max < tmpProfit){
                    max = tmpProfit;
                }
            }
            return max;
        }
      }
      ```

    - 解法二:
      - 在遍歷過程中維護當前見過的最低價格，同時計算當前價格與最低價格之差，如果這個差值大於當前最大利潤，則更新最大利潤。

      ```java
      public int maxProfit(int[] prices) {
          int minPrice = Integer.MAX_VALUE;
          int maxProfit = 0;
          for (int price : prices) {
              if (price < minPrice) {
                  minPrice = price;
              } else if (price - minPrice > maxProfit) {
                  maxProfit = price - minPrice;
              }
          }
          return maxProfit;
      }
      ```
