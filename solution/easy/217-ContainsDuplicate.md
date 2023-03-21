# 217. Contains Duplicate

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

**Example 1:**

```txt
Input: nums = [1,2,3,1]
Output: true
```

**Example 2:**

```txt
Input: nums = [1,2,3,4]
Output: false
```

**Example 3:**

```txt
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
```

**Constraints:**

```txt
1 <= nums.length <= 105
-109 <= nums[i] <= 109
```

## Solution

- loop 比對並使用 hash

## code

- java

  - Code

    ```java
    class Solution {
      public boolean containsDuplicate_hash(int[] nums) {
          HashMap<Integer,Integer> resultMap = new HashMap<Integer, Integer>();
          for (int i: nums){
              if (resultMap.containsKey(i)){
                  return true;
              }
              resultMap.put(i,1);
          }
          return false;
      }

      public static boolean containsDuplicate_sorted(int[] nums) {
          Arrays.sort(nums);
          for (int i = 1; i < nums.length; i++) {
              if (nums[i] == nums[i - 1]) {
                  return true;
              }
          }
          return false;
      }
    }
    ```
