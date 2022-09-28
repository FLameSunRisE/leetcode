# 414. Third Maximum Number

Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

**Example:**

```
Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
```

**Example:**

```
Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.
```


**Example:**

```
Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.
```

**Constraints:**

```
1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
```

## Solution:



## Code:

* java
  
```java
class Solution {
    public int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Integer maxOne = null;
        Integer maxTwo = null;
        Integer maxThree = null;
        for (Integer num : nums) {
            if (num.equals(maxOne) || num.equals(maxTwo) || num.equals(maxThree)){
                continue;
            }
            if (maxOne == null || num > maxOne) {
                maxThree = maxTwo;
                maxTwo = maxOne;
                maxOne = num;
            } else if (maxTwo == null || num > maxTwo) {
                maxThree = maxTwo;
                maxTwo = num;
            } else if (maxThree == null || num > maxThree) {
                maxThree = num;
            }
        }
        return maxThree == null ? maxOne : maxThree;
    }
}
```


* python

```py
class Solution:
```

* 


