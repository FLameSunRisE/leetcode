package test.linklist;

import main.linklist.ListNode;
import main.linklist.RemoveLinkedListElements203;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveLinkedListElements203Test {

    private RemoveLinkedListElements203 solution;

    @BeforeEach
    void setUp() {
        this.solution = new RemoveLinkedListElements203();
    }


    @Test
    public void testRemoveElements_basic() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        int val = 6;

        ListNode result = solution.removeElements(head, val);

        Assertions.assertEquals(1, result.val);
        Assertions.assertEquals(2, result.next.val);
        Assertions.assertEquals(3, result.next.next.val);
        Assertions.assertEquals(4, result.next.next.next.val);
        Assertions.assertEquals(5, result.next.next.next.next.val);
        Assertions.assertNull(result.next.next.next.next.next);
    }

    @Test
    public void testRemoveElements_allMatch() {
        ListNode head = new ListNode(6);
        head.next = new ListNode(6);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(6);

        int val = 6;

        ListNode result = solution.removeElements(head, val);

        Assertions.assertNull(result);
    }

    @Test
    public void testRemoveElements_emptyList() {
        ListNode head = null;

        int val = 5;

        ListNode result = solution.removeElements(head, val);

        Assertions.assertNull(result);
    }
}