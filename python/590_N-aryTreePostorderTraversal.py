
# Definition for a Node.
class Node:
    def __init__(self, val, children):
        self.val = val
        self.children = children
        
class Solution:
    def postorder(self, root: 'Node') -> 'List[int]':
        ans = []
        if not root:
            return ans
        for child in root.children:
            ans.extend(self.postorder(child))
        ans.append(root.val)
        return ans