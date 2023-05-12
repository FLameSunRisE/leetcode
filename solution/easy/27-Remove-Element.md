# [0. XXX](https://leetcode.com/problems/)

## 題目說明

Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

```
int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
                            // It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
```

If all assertions pass, then your solution will be accepted.

**Example:**

```txt
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
```

**Example:**

```txt
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
```

**Constraints:**

```txt
0 <= nums.length <= 100
0 <= nums[i] <= 50
0 <= val <= 100
```

## Solution

### 解法一: two point

- 思路
  - 步驟
    1. 初始化兩個指針，一個指向數組的起始位置，一個指向數組的末尾位置。
    2. 遍歷數組，當遇到值等於給定值 val 時，將末尾位置的元素複製到當前位置，然後將末尾位置向前移動一位。
    3. 如果遇到值不等於給定值 val 的元素，則將起始位置向後移動一位。
    4. 重複步驟 2 和步驟 3，直到起始位置超過末尾位置。
    5. 返回起始位置的值，即為新數組的長度。
- 效率
  - 時間複雜度：O(n)
    空間複雜度：O(1)
- code

  ```java
  class Solution {
    public int removeElement(int[] nums, int val) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            if (nums[start] == val) {
                nums[start] = nums[end];
                end--;
            } else {
                start++;
            }
        }

        return start;
    }
  }
  ```

### 解法二:

- ## 思路
- 效率
  - 時間複雜度：O(n)
    空間複雜度：O(n1)
- code

  ```java
  class Solution {

  }
  ```
