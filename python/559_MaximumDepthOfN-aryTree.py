"""
# Definition for a Node.
class Node:
    def __init__(self, val, children):
        self.val = val
        self.children = children
"""
class Solution:
    def maxDepth(self, root: 'Node') -> 'int':
        if root is None:
            return 0
        depth = 0
        for child in root.children:
            print ('child : '+str(child.val)+', depth : '+str(depth))
            depth = max(depth, self.maxDepth(child)) 
        print(depth)
        return depth+1


# if __name__ == '__main__':
#     solution = Solution()
#     print(solution.maxDepth([1], 0))  # 0
