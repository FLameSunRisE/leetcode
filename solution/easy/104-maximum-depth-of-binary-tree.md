# 104. Maximum Depth of Binary Tree

Given a**non-empty** array of integers, every element appears_twice_except for one. Find that single one.

**Note:**

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

**Example 1:**

```
Input:
 [2,2,1]

Output:
 1

```

**Example 2:**

```
Input:
 [4,1,2,1,2]

Output:
 4
solution:
```

Recursive

## code:

```py
class Solution:
    def maxDepth(self, root: 'TreeNode') -> 'int':
        if not root:
            return 0
        return 1 + max(self.maxDepth(root.left),self.maxDepth(root.right))
```



