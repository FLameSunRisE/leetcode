package leetcode.src.linklist;

/**
 * Created by jayyeh on 2022/07/29
 * <p>
 */
public class RemoveDuplicatesfromSortedList {
    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println();
        ListNode inputList = new ListNode();
        System.out.println(new RemoveDuplicatesfromSortedList().deleteDuplicates(inputList));
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        // basic check
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = head;
        while (dummy.next != null) {
            // if same jump to next
            if (dummy.next.val == dummy.val) {
                dummy.next = dummy.next.next;
            } else {
                dummy = dummy.next;
            }
        }
        return head;
    }
}
