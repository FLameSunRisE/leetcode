1480. Running Sum of 1d Array

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

<!-- **Note:**  -->

**Example 1:**
```
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
```

**Example 2:**
```
Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
```

**Example 3:**
```
Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]
```

**Constraints::**
```
1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6
```

## Solution:
- 解法一
  - for loop累加


## code:

- java
  - Code
    ```java
    class Solution {
      public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
      }
    }
    ```
- python
    ```py
    class Solution:
        # 解法一
        def runningSum(self, nums: List[int]) -> List[int]:
          total = 0
          rslt = [None] * len(nums)
          for i in range(len(nums)):
              total += nums[i]
              rslt[i] = total
          return rslt
        # 解法二
    ```
