# [11. Container With Most Water](https://leetcode.com/problems/container-with-most-water/)

- [11. Container With Most Water](#11-container-with-most-water)
  - [Solution](#solution)
    - [解法一:](#解法一)
    - [解法二:](#解法二)

---

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

**Example:**
![example1](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg)

```txt
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
```

**Example:**

```txt
Input: height = [1,1]
Output: 1
```

**Constraints:**

```txt
n == height.length
2 <= n <= 105
0 <= height[i] <= 104
```

## Solution

### 解法一:

- 思路
  - 將 length 等於 2 的情況個別處理
  - 初始化變數
    - left, right, maxLength
  - 透過 two-point 方法由外而內計算面積大小
    - 先計算當前面積在與 maxLength 比較,將大的更新至 maxLength
    - 移動指針
      - 若 height[left] > height[right] : right--
      - 反之: left++
- 效率
  - 時間複雜度：$O(n)$
    空間複雜度：$O(1)$
- code

  ```java
  class Solution {
    private int maxArea_first(int[] height) {
        if (height.length == 2) {
          return Math.min(height[0], height[1]);
        }
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
          int area = (right - left) * Math.min(height[left], height[right]);
          maxArea = Math.max(maxArea, area);
          if (height[left] < height[right]) {
            left++;
          } else {
            right--;
          }
        }
        return maxArea;
      }
  }
  ```

### 解法二:

- ## 思路
- 效率
  - 時間複雜度：$O(n)$
    空間複雜度：$O(n)$
- code

  ```java
  class Solution {

  }
  ```
