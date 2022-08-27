94. Binary Tree Inorder Traversal


Given the root of a binary tree, return the inorder traversal of its nodes' values.

 

<!-- **Note:**  -->

**Example 1:**
```
Input: root = [1,null,2,3]
Output: [1,3,2]
```

**Example 2:**
```
Input: root = []
Output: []
```

**Example 3:**
```
Input: root = [1]
Output: [1]
```

**Clarification:**
```
The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
```

## Solution:
- 二元搜尋樹的Inorder Traversal(中序遍歷)
  - 先找左 -> 父 -> 右集可
  - 透過stack紀錄拜訪歷程

## code:

- java
  - Code
    ```java
    class Solution {
      List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;     
    }
    ```
- python
    ```py
    class Solution:
        
    ```
