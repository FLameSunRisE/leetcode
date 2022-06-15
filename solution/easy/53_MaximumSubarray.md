53. Maximum Subarray

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.



<!-- **Note:**  -->

**Example 1:**
```
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
```

**Example 2:**
```
Input: nums = [1]
Output: 1
```

**Example 3:**
```
Input: nums = [5,4,-1,7,8]
Output: 23
```

**Clarification:**
```
1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
```

## Solution:
- 解法一
  - 基本檢核過濾
  - 透過DP進行處理,動態的比對當前與之前sum的值進行比對

## code:

<!-- - java
  - Code
    ```java
    class Solution {
    }
    ``` -->
- python
    ```py
    class Solution:
        # 解法一
        def maxSubArray(self, nums: List[int]) -> int:
          if len(nums) <= 0:
              return 0
          if len(nums) == 1:
              return nums[0]
          dp = [0]*len(nums)
          for i, num in enumerate(nums):
              dp[i] = max(dp[i-1] + num, num)
          return max(dp)

        # 解法二
    ```
