# 203. Remove Linked List Elements

Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

**Example 1:**

```txt
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
```

**Example 2:**

```txt
Input: head = [], val = 1
Output: []
```

**Example3:**

```txt
Input: head = [7,7,7,7], val = 7
Output: []
```

**Constraints:**

```txt
The number of nodes in the list is in the range [0, 104].
1 <= Node.val <= 50
0 <= val <= 50
```

## Solution

- 題目需要刪除指定值的節點
- 解法
  - 用一個哨兵節點來簡化刪除操作

    ![ [Java] Three Simple & Clean solutions w/ Explanation | Iterative & Recursive | Beats 100%](https://assets.leetcode.com/users/images/5e44c980-9079-49a8-af15-1a7088b21d02_1636679350.0082548.png)

## 時間複雜度：O(N)

## 空間複雜度：O(1)

recurive的層數

## code

- java

  - Code

    ```java
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            if (head == null) {
                return null;
            }

            ListNode dummy = new ListNode();
            dummy.next = head;
            ListNode cur = dummy;

            while (cur.next != null) {
                if (cur.next.val == val) {
                    cur.next = cur.next.next;
                    // Here cannot move cur to cur.next as we need to validate the next node.
                } else {
                    cur = cur.next;
                }
            }

            return dummy.next;
        }
    }
    ```


- Ref
  - [ [Java] Three Simple & Clean solutions w/ Explanation | Iterative & Recursive | Beats 100%](https://leetcode.com/problems/remove-linked-list-elements/solutions/1572932/java-three-simple-clean-solutions-w-explanation-iterative-recursive-beats-100/?orderBy=most_votes)