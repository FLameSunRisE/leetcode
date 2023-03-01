724. Find Pivot Index

Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.

<!-- **Note:**  -->

**Example 1:**

```
Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11
```

**Example 2:**

```
Input: nums = [1,2,3]
Output: -1
Explanation:
There is no index that satisfies the conditions in the problem statement.
```

**Example 3:**

```
Input: nums = [2,1,-1]
Output: 0
Explanation:
The pivot index is 0.
Left sum = 0 (no elements to the left of index 0)
Right sum = nums[1] + nums[2] = 1 + -1 = 0
```

**Constraints::**

```
1 <= nums.length <= 104
-1000 <= nums[i] <= 1000
```

## Solution

- 解法
在遍歷數組的過程中，我們需要比較當前元素左邊元素的總和是否等於整個數組總和減去當前元素和左邊元素的總和。如果相等，則當前元素的索引即為所求的 pivot index。



## code

- java
  - Code

    - 解法1:
      - 思路:
        逐一從數列的左邊開始加總，同時計算目前左邊元素的總和以及右邊元素的總和，直到找到中心索引點，如果找不到中心索引點就回傳 -1
      - Code

        ```java
        class Solution {
        public int[] runningSum(int[] nums) {
            if (nums.length == 1) {
                return 0;
            }
            int sum = IntStream.of(nums).sum();
            int tempSum = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == sum - 2 * tempSum) {
                    return j;
                }
                tempSum += nums[j];
            }
            return -1;
        }
        }
        ```

    - 解法2:
      - 思路:
        先算出總和，然後從左往右依次遍歷每個元素，同時計算左邊元素的總和以及右邊元素的總和，當左右元素總和相等時，就找到了pivot index。
      - Code

        ```java
        class Solution {
            public int pivotIndex(int[] nums) {
                int totalSum = IntStream.of(nums).sum();
                int leftSum = 0, rightSum = totalSum;
                for (int i = 0; i < nums.length; i++) {
                    rightSum -= nums[i];
                    if (leftSum == rightSum) {
                        return i;
                    }
                    leftSum += nums[i];
                }
                return -1;
            }
        }
        ```

- python

    ```py
    class Solution:
        # 解法一
      def pivotIndex(self, nums: List[int]) -> int:
          if(len(nums) == 1):
              return 0
          totSum = sum(nums)
          tempSum = 0
          for i in range(len(nums)):
              if(nums[i] == totSum - 2 * tempSum): 
                  return i
              tempSum += nums[i]
          return -1
        # 解法二
    ```
