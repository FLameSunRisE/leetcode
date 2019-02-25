
# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def traverse(self, root, res, depth):
        if not root:
            return []
        if depth == len(res):
            res.append([])
        res[depth].append(root.val)
        if root.left != None:
            self.traverse(root.left , res, depth + 1)
        if root.right != None:
            self.traverse(root.right , res, depth + 1)
        return res
       
    def averageOfLevels(self, root: TreeNode):
        ans = []
        self.traverse(root, ans, 0)
        for index in range(len(ans)):
            ans[index] = sum(ans[index]) / len(ans[index])
        return ans

def main():
    root = TreeNode(3)
    root.left = TreeNode(9)
    root.right = TreeNode(20)
    root.right.left = TreeNode(15)
    root.right.right = TreeNode(15)

    print(Solution().averageOfLevels(root))
    # Output: [[1,2,3,4]]
if __name__ == '__main__':
    main()
