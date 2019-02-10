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


def treeNodeToString(root):
    if not root:
        return "[]"
    output = ""
    queue = [root]
    current = 0
    while current != len(queue):
        node = queue[current]
        current = current + 1

        if not node:
            output += "null, "
            continue

        output += str(node.val) + ", "
        queue.append(node.left)
        queue.append(node.right)
    return "[" + output[:-2] + "]"


class Solution:
    # Inorder traversal
    # Left -> Root -> Right
    def inorderTraversal(self, root):
        res = []
        if root:
            res = self.inorderTraversal(root.left)
            res.append(root.val)
            res = res + self.inorderTraversal(root.right)
        return res

    def listToTreeNode(self, arr):
        inputTreeNodes = []
        for val in arr:
            inputTreeNodes.append(TreeNode(val))
            if val < len(inputTreeNodes)-1:
                inputTreeNodes[val].right = inputTreeNodes[val+1]
        return inputTreeNodes[0]

    # def increasingBST(self, root: 'TreeNode') -> 'TreeNode':
    #     ansList = self.inorderTraversal(root)
    #     print (ansList)
    #     self.listToTreeNode(ansList)
    #     return 
    def increasingBST(self, root):
        def inorder(node):
            if node:
                yield from inorder(node.left)
                yield node.val
                yield from inorder(node.right)

        ans = cur = TreeNode(None)
        for v in inorder(root):
            cur.right = TreeNode(v)
            cur = cur.right
        return ans.right

if __name__ == '__main__':
    solution = Solution()
    # ['A', 'B', 'C', 1, 2, 3, 'name', 'age', 4, 5, 6, 7]
    input ="[5,3,6,2,4,null,8,1,null,null,null,7,9]"
    # Output:  Output: [3, 60]
    root = stringToTreeNode(input)
    ret = solution.increasingBST(root)
    out = treeNodeToString(ret)
    print(out)
