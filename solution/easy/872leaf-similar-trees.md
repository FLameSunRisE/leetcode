# 872.  Leaf-Similar Trees

Consider all the leaves of a binary tree.  From left to right order, the values of those leaves form a_leaf value sequence._

![](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/16/tree.png)

For example, in the given tree above, the leaf value sequence is`(6, 7, 4, 9, 8)`.

Two binary trees are considered_leaf-similar_ if their leaf value sequence is the same.

Return`true`if and only if the two given trees with head nodes`root1`and`root2`are leaf-similar.

## Solution :

To find the leaves, which is the DFS problem, you can use the recursive solution.

Step1: Use DFS to go through the entire binary tree

Step2: If Root is None, it means no leaves

Step3: When root.left and root.right are set to None, this root is the leaf, so return its value

Step4: Adding the left and right sides is a list of leaves

## Code:

* python

```py
class Solution:
    def collectLeafNodes(self, node, leafs):
        if node.left is None and node.right is None:
            leafs.append(node.val)
        else:
            if node.left is not None:
                self.collectLeafNodes(node.left,leafs)
            if node.right is not None:
                self.collectLeafNodes(node.right,leafs)
        return leafs

    def leafSimilar(self, root1: 'TreeNode', root2: 'TreeNode') -> 'bool':
        oneLeaf = []
        twoLeaf = []
        oneLeaf = self.collectLeafNodes(root1, oneLeaf)
        twoLeaf = self.collectLeafNodes(root2, twoLeaf)
        return set(oneLeaf) ==set(twoLeaf)
```

* 


