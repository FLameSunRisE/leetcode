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
  - 
- 效率
  - 時間複雜度：$O(n)$
    空間複雜度：$O(n)$
- code

  ```java
  class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closeSum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
          // 跳過計算過的數字
          if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
          }
          int left = i + 1;
          int right = nums.length - 1;

          while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];
            if (sum == closeSum) {
              return sum;
            } else if (Math.abs(sum - target) < Math.abs(closeSum - target)) {
              closeSum = sum;
            }
            if (sum < target) {
              left++;
              while (left < right && nums[left] == nums[left - 1]) {
                left++;
              }
            } else {
              right--;
              while (left < right && nums[right] == nums[right + 1]) {
                right--;
              }
            }
          }

        }
        return closeSum;
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
