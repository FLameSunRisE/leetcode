# [112. Path Sum](https://leetcode.com/problems/path-sum/)

- [112. Path Sum](#112-path-sum)
  - [Solution](#solution)
    - [解法一:](#解法一)
    - [解法二:](#解法二)

---

Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.

 

**Example:**

```txt
Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
Output: true
Explanation: The root-to-leaf path with the target sum is shown.
```

**Example:**

```txt
Input: root = [1,2,3], targetSum = 5
Output: false
Explanation: There two root-to-leaf paths in the tree:
(1 --> 2): The sum is 3.
(1 --> 3): The sum is 4.
There is no root-to-leaf path with sum = 5.
```

**Example:**

```txt
Input: root = [], targetSum = 0
Output: false
Explanation: Since the tree is empty, there are no root-to-leaf paths.
```

**Constraints:**

```txt
The number of nodes in the tree is in the range [0, 5000].
-1000 <= Node.val <= 1000
-1000 <= targetSum <= 1000
```

## Solution

### 解法一:

- 思路
  - 可以使用**遞歸的方式遍歷二叉樹**，並計算從根節點到當前節點的路徑上所有節點值的總和。
    - 在遍歷的過程中，對於每個節點，需要檢查以下條件：
      - 如果當前節點是葉節點，則檢查路徑的總和是否等於目標和。
      - 如果當前節點不是葉節點，則遞歸遍歷它的左子樹和右子樹，並將目標和減去當前節點的值，作為新的目標和傳遞給子樹。
      - 如果存在一條路徑的節點值總和等於目標和，則返回 true，否則返回 false。
  - 遞歸遍歷二叉樹的一般步驟：
    - 檢查當前節點是否為空。如果是空節點，則返回。
    - 處理當前節點的操作，例如計算路徑和、判斷是否符合條件等。
    - 遞歸遍歷當前節點的左子樹。
    - 遞歸遍歷當前節點的右子樹。

- 效率
  - 時間複雜度：$O(n)$
    - $n$ 是二叉樹的節點數量
  - 空間複雜度：$O(\log n)$ ～ $O(n)$
    - 最壞情況下，當二叉樹為一個鏈式結構時，遞歸的深度是 $O(n)$
- code

  ```java
  class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // 當前節點為空，返回 false
        if (root == null) {
            return false;
        }
        
        // 當前節點為葉節點，檢查路徑和是否等於目標和
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        
        // 遞歸遍歷左子樹和右子樹，將目標和減去當前節點的值
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
  }
  ```

### 解法二:

- 思路
  - 
- 效率
  - 時間複雜度：$O(n)$
    空間複雜度：$O(n)$
- code

  ```java
  class Solution {

  }
  ```
