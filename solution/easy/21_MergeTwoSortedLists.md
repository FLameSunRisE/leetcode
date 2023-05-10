# 21. Merge Two Sorted Lists

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

<!-- **Note:**  -->

**Example 1:**

```txt
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
```

**Example 2:**

```txt
Input: list1 = [], list2 = []
Output: []
```

**Example 3:**

```txt
Input: list1 = [], list2 = [0]
Output: [0]
```

**Clarification:**

```
The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
```

## Solution

1. 基本檢核去除空值
2. in-place , iteratively

- Question?

  - 為何 java 需要使用 dummy node :
    當我們建立一個新的 Linked List 時，我們需要有一個頭節點 (head node) 來表示這個 Linked List 的起點，通常會將第一個元素作為頭節點。
    但是，當我們需要插入一個新的元素時，插入的位置不一定在頭節點之後，而且如果我們不小心修改了頭節點，那麼原本的 Linked List 就會遺失，因此不方便操作。

  - **Note: 使用 dummy 節點 (dummy node) 可以解決這個問題**
    - 合併兩個有序的 Linked List
    - 遍歷 Linked List 時，也可以從 dummy 節點開始

- 運算過程

  - 題目

    ```rust
    l1: 1 -> 2 -> 4 -> null
    l2: 1 -> 3 -> 4 -> null
    ```

  - 過程

    - 圖示

    ```rust
    dummy -> null

    prev: dummy
    l1: 1 -> 2 -> 4 -> null
    l2: 1 -> 3 -> 4 -> null

    1 <= 1
    dummy -> 1 -> null

    prev: 1
    l1: 2 -> 4 -> null
    l2: 1 -> 3 -> 4 -> null

    1 <= 2
    1 -> 1 -> null

    prev: 1 -> 1
    l1: 2 -> 4 -> null
    l2: 3 -> 4 -> null

    2 <= 3
    1 -> 1 -> 2 -> null

    prev: 1 -> 1 -> 2
    l1: 4 -> null
    l2: 3 -> 4 -> null

    3 <= 4
    1 -> 1 -> 2 -> 3 -> null

    prev: 1 -> 1 -> 2 -> 3
    l1: 4 -> null
    l2: 4 -> null

    4 <= 4
    1 -> 1 -> 2 -> 3 -> 4 -> null

    prev: 1 -> 1 -> 2 -> 3 -> 4
    l1: null
    l2: null

    return dummy.next
    ```

## code

- java

  - Code

    ```java
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null && list2 == null) {
                return null;
            }
            if (list1 == null) {
                return list2;
            }
            if (list2 == null) {
                return list1;
            }
            ListNode dummy = new ListNode(0);
            ListNode curr = dummy;
            while(list1 != null && list2!= null){
                if(list1.val <= list2.val){
                    curr.next = list1;
                    list1 = list1.next;
                }else {
                    curr.next = list2;
                    list2 = list2.next;
                }
                curr = curr.next;
            }

            if(list1==null){
                curr.next=list2;
            }else{
                curr.next=list1;
            }
            return dummy.next;
    }
    }
    ```

- python

  ```py
  class Solution:
      # 解法一
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
      # 解法二
  ```
