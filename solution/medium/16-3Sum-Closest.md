# [16. 3Sum Closest](https://leetcode.com/problems/3sum-closest/)

- [16. 3Sum Closest](#16-3sum-closest)
  - [Solution](#solution)
    - [解法一:](#解法一)
    - [解法二:](#解法二)

---

Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

**Example:**

```txt
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
```

**Example:**

```txt
Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
```

**Constraints:**

```txt
3 <= nums.length <= 500
-1000 <= nums[i] <= 1000
-104 <= target <= 104
```

## Solution

### 解法一:

- 思路
  - 首先排序,與```15.3 Sum```那堤解題思路一樣
  - 初始化變數:
    - closeSum: 最接近target的暫存變數
  - 
- 效率
  - 時間複雜度：$O(n)$
    空間複雜度：$O(n)$
- code

  ```java
  class Solution {
    public int threeSumClosest(int[] nums, int target) {
      Arrays.sort(nums);
      int n = nums.length;
      int closestSum = nums[0] + nums[1] + nums[2];

      for (int i = 0; i < n - 2; i++) {
        int left = i + 1;
        int right = n - 1;

        while (left < right) {
          int sum = nums[i] + nums[left] + nums[right];
          if (sum == target) {
            return sum;
          } else if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
            closestSum = sum;
          }

          if (sum < target) {
            left++;
          } else {
            right--;
          }
        }
      }
      return closestSum;
    }
  }
  ```

### 解法二:

- 思路
  - 
- 效率
  - 時間複雜度：$O(n)$
    空間複雜度：$O(n)$
- code

  ```java
  class Solution {

  }
  ```
