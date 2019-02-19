# 872.  Leaf-Similar Trees

Consider all the leaves of a binary tree.  From left to right order, the values of those leaves form a_leaf value sequence._

![](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/16/tree.png)

For example, in the given tree above, the leaf value sequence is`(6, 7, 4, 9, 8)`.

Two binary trees are considered_leaf-similar_ if their leaf value sequence is the same.

Return`true`if and only if the two given trees with head nodes`root1`and`root2`are leaf-similar.



## Solution :

要找到樹葉，也就是DFS問題，因此可以用遞迴解。

Step1: 用DFS去走整個二元樹

Step2: 若遇到Root為None時，表示沒有樹葉

Step3: 遇到root.left 和 root.right 為None時，表示此root為樹葉，因此return其value

Step4: 將左邊與右邊加起來就是經過樹葉的list



