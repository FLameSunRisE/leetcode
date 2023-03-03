# 206. Reverse Linked List

Reverse a singly linked list.

- **Example 1:**

```
Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NUL
```

- **Example 2:**

```
Input: head = [1,2]
Output: [2,1]
```

- **Example 3:**

```
Input: head = []
Output: []
```

## Solution

- while 循環來依次反轉ListNode
- 初始化
  - curNode 指向原鏈結表的頭節點
  - preNode 指向空節點
  - nextNode
- 邏輯
  - 當 curNode 不為空時，用 nextNode 暫存 curNode 的下一個節點，然後將 curNode 的下一個節點指向 preNode。
  - 將 preNode -> curNode，將 curNode -> nextNode。
  - 重複以上操作直到 curNode 為空，preNode 即為反轉後的鏈結表的頭節點。

## Code

- java

  - Code

    ```java
    class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode preNode = null;
            ListNode curNode = head;
            while (curNode != null) {
                ListNode nextNode = curNode.next;
                curNode.next = preNode;
                preNode = curNode;
                curNode = nextNode;
            }
            return preNode;
        }
    }
    ```

- python:

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
