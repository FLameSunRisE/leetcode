# 108. Convert Sorted Array to Binary Search Tree

Given an integer array nums where the elements are sorted in ascending order, convert it to a 
height-balanced
 binary search tree.

**Example 1:**

```txt
Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:
```

**Example 2:**

```txt
Input: nums = [1,3]
Output: [3,1]
Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
```

**Constraints:**

```txt
1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in a strictly increasing order.
```

## Solution

- 典型二元搜尋樹解法
- 使用recurive去切分中心

## 時間複雜度：O(N)

## 空間複雜度：O(logN)

recurive的層數

## code

- java

  - Code

    ```java
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            if (nums == null || nums.length == 0) {
                return null;
            }
            return helper(nums, 0, nums.length - 1);
        }

        private TreeNode helper(int[] nums, int left, int right) {
            if (left > right) {
                return null;
            }
            int mid = (left + right) / 2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = helper(nums, left, mid - 1);
            root.right = helper(nums, mid + 1, right);
            return root;
        }
    }
    ```
