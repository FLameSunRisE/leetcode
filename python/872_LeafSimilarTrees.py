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


def main():
    # input1 = "[3,5,1,6,2,9,8,null,null,7,4]"
    # input2 = "[3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]"
    input1 ="[1,2]"
    input2 ="[2,2]"
    # Output:  Output: [3, 60]
    root1 = stringToTreeNode(input1)
    root2 = stringToTreeNode(input2)
    ret = Solution().leafSimilar(root1, root2)
    out = (ret)
    print(out)


if __name__ == '__main__':
    main()
