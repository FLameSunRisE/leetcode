# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None


class Solution:
    def middleNode(self, head: 'ListNode') -> 'ListNode':


if __name__ == '__main__':
    solution = Solution()
    print(solution.middleNode([1,2,3,4,5]))
    # Output: Node 3 from this list (Serialization: [3,4,5])
    # The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
    print(solution.middleNode([[1,2,3,4,5,6]]))
    # Output: Node 4 from this list (Serialization: [4,5,6])
