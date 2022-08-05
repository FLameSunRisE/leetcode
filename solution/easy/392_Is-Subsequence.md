392. Is Subsequence

Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

<!-- **Note:**  -->

**Example 1:**
```
Input: s = "abc", t = "ahbgdc"
Output: true
```

**Example 2:**
```
Input: s = "axc", t = "ahbgdc"
Output: false
```


**Constraints::**
```
0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.
```

## Solution:
- 解法
這題主要是依照順序找出子字串的字母是否存在於目標字串中。
因此先處理等於0以及長度的前置處理,再透過loop去比對字母
若比對數量等於```s```則表示true,反之為false.



## code:

- java
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
