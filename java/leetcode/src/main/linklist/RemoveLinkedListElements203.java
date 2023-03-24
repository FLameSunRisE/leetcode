package main.linklist;

/**
 * RemoveLinkedListElements203.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/03/24
 */
public class RemoveLinkedListElements203 {
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
            } else {
                cur = cur.next;
            }
        }

        return dummy.next;
    }
}
