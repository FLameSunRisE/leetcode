# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        if len(list1) == 0:
            return list2
        if len(list2) == 0:
            return list2

        for i in list1:
            print(i)
        return []


def main():
    # Example:1
    list1 = [1, 2, 4], list2 = [1, 3, 4]
    print(Solution().mergeTwoLists(list1, list2))
    # Input: list1 = [1, 2, 4], list2 = [1, 3, 4]
    # Output: [1, 1, 2, 3, 4, 4]

    # Example:2
    list1 = [], list2 = []
    print(Solution().mergeTwoLists(list1, list2))
    # Input: list1 = [], list2 = []
    # Output: []

    # Example:3
    list1 = [], list2 = []
    print(Solution().mergeTwoLists(list1, list2))
    # Input: list1 = [], list2 = [0]
    # Output: [0]

# Error case
# print(Solution().isValid("]"))
# # Output: false


if __name__ == '__main__':
    main()
