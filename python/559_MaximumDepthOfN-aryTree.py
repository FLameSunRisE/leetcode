"""
# Definition for a Node.
class Node:
    def __init__(self, val, children):
        self.val = val
        self.children = children
"""
class Solution:
    def maxDepth(self, root: 'Node') -> 'int':
        ans = []
        if root is None:
            return 0
        depth = 0
        for child in root.children:
            depth = max(depth, self.maxDepth(child))
            ans.append(self.maxDepth(child))    
        print(ans)
        return max(ans)


# if __name__ == '__main__':
#     solution = Solution()
#     print(solution.maxDepth([1], 0))  # 0
