# 914. X of a Kind in a Deck of Cards

You are given an integer array deck where deck[i] represents the number written on the ith card.

Partition the cards into one or more groups such that:

Each group has exactly x cards where x > 1, and
All the cards in one group have the same integer written on them.
Return true if such partition is possible, or false otherwise.

**Example 1:**

```txt
Input: deck = [1,2,3,4,4,3,2,1]
Output: true
Explanation: Possible partition [1,1],[2,2],[3,3],[4,4].
```

**Example 2:**

```txt
Input: deck = [1,1,1,2,2,2,3,3]
Output: false
Explanation: No possible partition.
```

**Clarification:**

```txt
1 <= deck.length <= 104
0 <= deck[i] < 104
```

## Solution

### 解法一

- 說明
  - 基本檢核排除小於二的陣列
  - 先統整出每個數字的出現數字(hashmap)
  - 接者找到他們的最大公因數即可
    - 最大公因數可以使用 Euclidean Algorithm（輾轉相除法）求解

- 時間複雜度：$O(nlog(min(a, b)))$
- 空間複雜度：$O(n)$

  ```java
  class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        if (deck == null || deck.length < 2) {
            return false;
        }
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : deck) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        int gcd = -1;
        for (int count : countMap.values()) {
            if (count % 2 != 0) {
                return false;
            }
            if (gcd == -1) {
                gcd = count;
            } else {
                gcd = gcd(gcd, count);
            }
        }
        return gcd >= 2;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
  }
  ```
