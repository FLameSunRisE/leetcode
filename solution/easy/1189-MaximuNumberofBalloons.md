# [1189. Maximum Number of Balloons](https://leetcode.com/problems/maximum-number-of-balloons/)

Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.

**Example:**

```txt
Input: text = "nlaebolko"
Output: 1
```

**Example:**

```txt
Input: text = "loonbalxballpoon"
Output: 2
```

**Example:**

```txt
Input: text = "leetcode"
Output: 0
```

**Constraints:**

```txt
1 <= text.length <= 104
text consists of lower case English letters only.
```

## Solution

### 解法一:HashMap

- 思路
  - 透過 HashMap 紀錄 Input 文字的出現次數
  - 再透過 Min 參數去計算 balloon 出現的最小次數
    - 由於是用覆蓋的方式所以可以取得完整出現 balloon 的最小次數
- 效率
  - 時間複雜度：O(n)
    空間複雜度：O(1)
- code

```java
class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> tmpMap = new HashMap<>();
        for (char c : text.toCharArray()) {
        tmpMap.put(c, tmpMap.getOrDefault(c, 0) + 1);
        }
        int min = Integer.MAX_VALUE;
        min = Math.min(min, tmpMap.getOrDefault('b', 0));
        min = Math.min(min, tmpMap.getOrDefault('a', 0));
        min = Math.min(min, tmpMap.getOrDefault('l', 0) / 2);
        min = Math.min(min, tmpMap.getOrDefault('o', 0) / 2);
        min = Math.min(min, tmpMap.getOrDefault('n', 0));
        return min;
  }
}
```

## 解法二:排序

- 思路
  - 發法同 solution1,差異只是在於改用 array 紀錄出現次數
  - 並使用 Unicode 的方式去計算
    - 在 ASCII 碼中，字母 a-z 的編碼值是 97-122
    - 通過字符減去 a 的編碼值來計算其在 26 個字母中的位置（即 a 的位置為 0，b 的位置為 1，依此類推）
- 效率

  - 時間複雜度：O(NlogN)
    空間複雜度：O(1)

- code

```java
class Solution {
  public int maxNumberOfBalloons_chatgpt(String text) {
    int[] count = new int[26];
    for (char c : text.toCharArray()) {
      count[c - 'a']++;
    }
    int min = count[1]; // 'a'
    min = Math.min(min, count[0]); // 'b'
    min = Math.min(min, count[11] / 2); // 'l'
    min = Math.min(min, count[14] / 2); // 'o'
    min = Math.min(min, count[13]); // 'n'
    return min;
  }
}
```
