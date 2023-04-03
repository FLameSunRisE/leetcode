# 860. Lemonade Change

At a lemonade stand, each lemonade costs $5. Customers are standing in a queue to buy from you and order one at a time (in the order specified by bills). Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill. You must provide the correct change to each customer so that the net transaction is that the customer pays $5.

Note that you do not have any change in hand at first.

Given an integer array bills where bills[i] is the bill the ith customer pays, return true if you can provide every customer with the correct change, or false otherwise.

**Example 1:**

```txt
Input: bills = [5,5,10,10,20]
Output: false
Explanation: 
From the first two customers in order, we collect two $5 bills.
For the next two customers in order, we collect a $10 bill and give back a $5 bill.
For the last customer, we can not give the change of $15 back because we only have two $10 bills.
Since not every customer received the correct change, the answer is false.
```

**Example 2:**

```txt
Input: bills = [5,5,5,10,20]
Output: true
Explanation: 
From the first 3 customers, we collect three $5 bills in order.
From the fourth customer, we collect a $10 bill and give back a $5.
From the fifth customer, we give a $10 bill and a $5 bill.
Since all customers got correct change, we output true.
```

**Clarification:**

```txt
1 <= bills.length <= 105
bills[i] is either 5, 10, or 20.
```

## Solution

### 解法一

- 說明
  - 由於每次交易都要找錢,於是紀錄5,10的數量即可,且當為負數時return false
    - fiveCount
    - tenCount
  - Loop bills
    - bill = 5
      - fiveCount 加一
    - bill = 10
      - 检查是否有足够的 5 元张数
    - bill = 20
      - 则检查是否有足够的 10 元和 5 元张数
        - 先使用 10 元和 5 元找零，10 元张数减 1，5 元张数减 1
          - tenCount 減1
          - fiveCount 減1
        - 检查是否有足够的 5 元张数
          - fiveCount 減3

- 時間複雜度：$O(n)$
- 空間複雜度：$O(1)$

  ```java
  class Solution {
        public boolean lemonadeChange(int[] bills) {
            int fiveCount = 0;
            int tenCount = 0;
            for (int i = 0; i < bills.length; i++) {
                int cur = bills[i];
                switch (cur) {
                    case 5:
                        fiveCount++;
                        break;
                    case 10:
                        if (fiveCount >= 1) {
                            fiveCount--;
                            tenCount++;
                        } else {
                            return false;
                        }
                        break;
                    case 20:
                        if (tenCount >= 1 && fiveCount >= 1) {
                            tenCount--;
                            fiveCount--;
                        } else if (fiveCount >= 3) {
                            fiveCount -= 3;
                        } else {
                            return false;
                        }
                        break;
                    default:
                        break;
                }
                if (fiveCount < 0 || tenCount < 0) {
                    return false;
                }
            }
            return true;
        }
    }
  ```
