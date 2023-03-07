# 589. N-ary Tree Preorder Traversal


Given the root of an n-ary tree, return the preorder traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)


**Example 1:**

```txt
Input: root = [1,null,3,2,4,null,5,6]
Output: [1,3,5,6,2,4]
```

**Example 2:**

```txt
Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
Output: [1,2,3,6,7,11,14,4,8,12,5,9,13,10]
```

**Constraints:**

```
The number of nodes in the tree is in the range [0, 104].
0 <= Node.val <= 104
The height of the n-ary tree is less than or equal to 1000.
 
```

## Solution

- 利用遞迴來實現前序遍歷

## 時間複雜度：O(N)
每個節點都會被遍歷一次

## 空間複雜度：O(N)
空間複雜度取決於遞迴的深度

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
