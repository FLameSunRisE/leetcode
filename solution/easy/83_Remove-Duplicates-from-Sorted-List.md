83. Remove Duplicates from Sorted List

Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

 
 

<!-- **Note:**  -->

**Example 1:**
```
Input: head = [1,1,2]
Output: [1,2]
```

**Example 2:**
```
Input: head = [1,1,2,3,3]
Output: [1,2,3]
```

**Clarification:**
```
The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.
```

## Solution:
- 跑loop當next == next.next時直接指到下一個位置


## code:

- java
  - Code
    ```java
    class Solution {
      public ListNode deleteDuplicates(ListNode head) {
        // basic check
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy=head;
        while(dummy.next!=null){
            // if same jump to next
            if(dummy.next.val==dummy.val){
                dummy.next=dummy.next.next;
            }else{
                dummy=dummy.next;  
            } 
        }
        return head;
      }
    }
    ```
- python
    ```py
    class Solution:
        # 解法一
        
        # 解法二
    ```
