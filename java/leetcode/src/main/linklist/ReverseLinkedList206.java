package main.linklist;

/**
 * ReverseLinkedList206-反向链接list206.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/03/03
 */
public class ReverseLinkedList206 {
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
