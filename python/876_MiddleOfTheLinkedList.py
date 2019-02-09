# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

    def traverse(self):
        node = self # start from the head node
        while node != None:
            print (node.val )# access the node value
            node = node.next # move on to the next node

class Solution:
    def listToListNode(self, arr):
        inputListNodes = []
        for val in arr:
            inputListNodes.append(ListNode(val))
            for val in range(len(inputListNodes)):
                if val < len(inputListNodes)-1:
                    inputListNodes[val].next = inputListNodes[val+1]
        return inputListNodes[0]

    def middleNode(self, head: 'ListNode') -> 'ListNode':
        nodeList = [head]
        while nodeList[-1].next:
            nodeList.append(nodeList[-1].next)
        print(nodeList[len(nodeList) // 2].traverse())
        return nodeList[len(nodeList) // 2]


if __name__ == '__main__':
    solution = Solution()
    inputList = [1, 2,3,4,5]
    print(solution.middleNode(node1))
    print(solution.middleNode(solution.listToListNode(inputList)))
    # Output: Node 3 from this list (Serialization: [3,4,5])
    # The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
    inputList = [1, 2, 3, 4, 5, 6]
    print(solution.middleNode(solution.listToListNode(inputList)))
    # Output: Node 4 from this list (Serialization: [4,5,6])
