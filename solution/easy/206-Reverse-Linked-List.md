206. Reverse Linked List

Reverse a singly linked list.

1. 
**Example :**

```
Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NUL
```

## Solution:
    缺

## Code:

* python:

```py3
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        # 初始化
        prev = None
        while head:
            curr = head
            head = head.next
            curr.next = prev
            prev = curr
```



