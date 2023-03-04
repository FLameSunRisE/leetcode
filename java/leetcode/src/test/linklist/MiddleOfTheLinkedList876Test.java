package leetcode.src.test.linklist;

import leetcode.src.main.linklist.ListNode;
import leetcode.src.main.linklist.MiddleOfTheLinkedList876;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfTheLinkedList876Test {
    private MiddleOfTheLinkedList876 solution;

    @BeforeEach
    void setUp() {
        this.solution = new MiddleOfTheLinkedList876();
    }


    @Test
    void testMiddleNode1() {
        // Input: 1->2->3->4->5->NULL
        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        // Expected Output: 3->4->5->NULL
        ListNode expected = new ListNode(3, new ListNode(4, new ListNode(5)));

        ListNode result = solution.middleNode(node1);
        assertEquals(expected, result);
    }

    @Test
    void testMiddleNode2() {
        // Input: 1->2->3->4->5->6->NULL
        ListNode node6 = new ListNode(6, null);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        // Expected Output: 4->5->6->NULL
        ListNode expected = new ListNode(4, new ListNode(5, new ListNode(6)));

        ListNode result = solution.middleNode(node1);
        assertEquals(expected, result);
    }

    @Test
    void testMiddleNode3() {
        // Input: 1->NULL
        ListNode node1 = new ListNode(1);

        // Expected Output: 1->NULL
        ListNode expected = new ListNode(1);

        ListNode result = solution.middleNode(node1);
        assertEquals(expected, result);
    }
}