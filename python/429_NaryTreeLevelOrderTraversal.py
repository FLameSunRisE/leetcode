
# Definition for a Node.
class Node:
    def __init__(self, val, children):
        self.val = val
        self.children = children
class Solution:
    def traverse(self, res, root, depth):
        if not root:
            return []
        if depth == len(res):
            res.append([])
        res[depth].append(root.val)
        for child in root.children:
            self.traverse(child, res, depth + 1)
        return res
    def levelOrder(self, root):
        ans = []
        self.traverse(ans, root, 0)
        return ans

def main():
    nums = [[1,2],[3,4]]
    Solution().levelOrder(nums, 1, 4)
    # Output: [[1,2,3,4]]

if __name__ == '__main__':
    main()
