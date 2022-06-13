# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    # TODO(Jay), 需在理解此解法
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        if None in (list1, list2):
            return list1 or list2
        dummy = cur = ListNode(0)
        dummy.next = list1
        while list1 and list2:
            if list1.val < list2.val:
                list1 = list1.next
            else:
                nxt = cur.next
                cur.next = list2
                tmp = list2.next
                list2.next = nxt
                list2 = tmp
            cur = cur.next
        cur.next = list1 or list2
        return dummy.next


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
