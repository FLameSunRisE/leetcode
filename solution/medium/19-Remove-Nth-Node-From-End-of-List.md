# [19. Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

- [19. Remove Nth Node From End of List](#19-remove-nth-node-from-end-of-list)
  - [Solution](#solution)
    - [解法一:](#解法一)
    - [解法二:](#解法二)

---

Given the head of a linked list, remove the nth node from the end of the list and return its head.

**Example:**

![19_ex1](https://assets.leetcode.com/uploads/2020/10/03/remove_ex1.jpg)

```txt
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
```

**Example:**

```txt
Input: head = [1], n = 1
Output: []
```

**Example:**

```txt
Input: head = [1,2], n = 1
Output: [1]
```

**Constraints:**

```txt
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz  
```

## Solution

### 解法一:

- 思路
  - 透過two point概念計算
  - 初始化:
    - fast point: 先往前位移 n 位數 (因需刪除倒數n位的值)
    - slow point: 從0開始
  - 透過loop迴圈直到fast指針走到最後一筆為止，即可刪除slow當前的位置
- 效率
  - 時間複雜度：$O(n)$
    空間複雜度：$O(1)$
- code

  ```java
  class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      // 創建虛擬節點作為鏈表的頭節點
      ListNode dummy = new ListNode(0);
      dummy.next = head;

      // 初始化快指針和慢指針
      ListNode fast = dummy;
      ListNode slow = dummy;

      // 將快指針向前移動 n 步
      for (int i = 0; i < n; i++) {
        fast = fast.next;
      }

      // 同時移動快指針和慢指針，直到快指針到達鏈表的末尾
      while (fast.next != null) {
        fast = fast.next;
        slow = slow.next;
      }

      // 刪除倒數第 n 個節點
      slow.next = slow.next.next;

      // 返回新的鏈表的頭節點
      return dummy.next;
    }
  }
  ```

### 解法二:

- ## 思路
- 效率
  - 時間複雜度：$O(n)$
    空間複雜度：$O(n)$
- code

  ```java
  class Solution {

  }
  ```
