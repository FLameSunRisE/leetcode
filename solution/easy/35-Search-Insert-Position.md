# [35. Search Insert Position](https://leetcode.com/problems/search-insert-position/)

- [35. Search Insert Position](#35-search-insert-position)
  - [Solution](#solution)
    - [解法一:](#解法一)
    - [解法二:插入排序](#解法二插入排序)

---

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

**Example:**

```txt
Input: nums = [1,3,5,6], target = 5
Output: 2
```

**Example:**

```txt
Input: nums = [1,3,5,6], target = 2
Output: 1
```

**Example:**

```txt
Input: nums = [1,3,5,6], target = 7
Output: 4
```

**Constraints:**

```txt
1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
```

## Solution

### 解法一:

- 思路
  - 透過二分搜尋法
  - 因此初始化 start, mid, end 這三個參數
  - 透過 while 迴圈不斷的比較直到找到 target 為止
- 效率
  - 時間複雜度：O(log n)
    空間複雜度：O(1)
- code

  ```java
  class Solution {
  /**
    * searchInsert_first-two point.
    * time complexity: O(log n)
    * space complexity: O(1).
    *
    * @param nums
    * @param target
    * @return int
    */
    private int searchInsert_first(int[] nums, int target) {
      int start = 0;
      int mid = nums.length / 2;
      int end = nums.length - 1;
      while(nums[mid] != target) {
        if (nums[mid] > target) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
        mid = (start + end) / 2;
        if (start > end) {
          return start;
        }
      }
      return mid;
    }

  }
  ```

### 解法二:插入排序

- 思路
  - 類似上方解法,皆為二分搜尋概念
- 效率
  - 時間複雜度：$O(log n)$
    空間複雜度：$O(1)$
- code

  ```java
  class Solution {
    private int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

  }
  ```
