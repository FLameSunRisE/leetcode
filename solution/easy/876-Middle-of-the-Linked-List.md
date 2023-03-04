# 876. Middle of the Linked List

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

- **Example 1:**

```
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
```

- **Example 2:**

```
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
```

## Solution

要找到鏈表的中間節點，可以使用快慢指針法，
使用兩個指針，一個指針 slow 每次移動一步，另一個指針 fast 每次移動兩步。
當 fast 指針到達鏈表尾部時，slow 指針剛好指向鏈表的中間節點。

具體實現可以按照以下步驟進行：

定義兩個指針 slow 和 fast，初始值都指向鏈表的頭節點 head。

使用 while 循環依次移動 slow 和 fast 指針。其中，slow 指針每次移動一步，而 fast 指針每次移動兩步。當 fast 指針移動到鏈表的尾部時，slow 指針剛好指向鏈表的中間節點。

返回 slow 指針指向的節點。

## Code

- java

  - Code

    ```java
    class Solution {
      public ListNode middleNode(ListNode head) {
          ListNode slow = head, fast = head;
          while (fast != null && fast.next != null) {
              slow = slow.next;
              fast = fast.next.next;
          }
          return slow;
      }
    }
    ```