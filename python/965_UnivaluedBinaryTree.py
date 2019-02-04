# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

def stringToTreeNode(input):
    input = input.strip()
    input = input[1:-1]
    if not input:
        return None

    inputValues = [s.strip() for s in input.split(',')]
    root = TreeNode(int(inputValues[0]))
    nodeQueue = [root]
    front = 0
    index = 1
    while index < len(inputValues):
        node = nodeQueue[front]
        front = front + 1

        item = inputValues[index]
        index = index + 1
        if item != "null":
            leftNumber = int(item)
            node.left = TreeNode(leftNumber)
            nodeQueue.append(node.left)

        if index >= len(inputValues):
            break

        item = inputValues[index]
        index = index + 1
        if item != "null":
            rightNumber = int(item)
            node.right = TreeNode(rightNumber)
            nodeQueue.append(node.right)
    return root

class Solution:
    def isUnivalTree(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        ansList = []
        def dfs(node):
            if node:
                ansList.append(node.val)
                dfs(node.left)
                dfs(node.right)

        dfs(root)
        ansSet = set(ansList)
        if len(ansSet)==1:
            return True
        return False


if __name__ == '__main__':
    solution = Solution()
    tree = stringToTreeNode('[1,1,1,1,1,null,1]')
    print(solution.isUnivalTree(tree))
    tree = stringToTreeNode('[2,2,2,5,2]')
    print(solution.isUnivalTree(tree))

