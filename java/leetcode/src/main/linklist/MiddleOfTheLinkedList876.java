package leetcode.src.main.linklist;

/**
 * MiddleOfTheLinkedList876.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/03/04
 */
public class MiddleOfTheLinkedList876 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
