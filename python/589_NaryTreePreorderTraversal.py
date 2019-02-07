
# Definition for a Node.


class Node:
    def __init__(self, val, children):
        self.val = val
        self.children = children


class Solution:
    def preorder(self, root: 'Node') -> 'List[int]':
        ansList = []
        if not root:
            return ansList
        ansList.append(root.val)
        for child in root.children:
            ansList.extend(self.preorder(child))
        return ansList

if __name__ == '__main__':
    solution = Solution()
    inputTestcase = {"$id": "1", "children": [{"$id": "2", "children": [{"$id": "5", "children": [], "val":5}, {
        "$id": "6", "children": [], "val":6}], "val":3}, {"$id": "3", "children": [], "val":2}, {"$id": "4", "children": [], "val":4}], "val": 1}
    print(type(inputTestcase))

