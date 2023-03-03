package leetcode.src.test.linklist;

import leetcode.src.main.linklist.ListNode;
import leetcode.src.main.linklist.MergeTwoSortedLists21;
import leetcode.src.main.linklist.ReverseLinkedList206;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseLinkedList206Test {

    private ReverseLinkedList206 solution;

    @BeforeEach
    public void setUp() {
        this.solution = new ReverseLinkedList206();
    }

    @Test
    void test_reverse_linked_list_1() {
        // Input: 1->2->3->4->5->NULL
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // Expected Output: 5->4->3->2->1->NULL
        ListNode expected1 = new ListNode(5);
        ListNode expected2 = new ListNode(4);
        ListNode expected3 = new ListNode(3);
        ListNode expected4 = new ListNode(2);
        ListNode expected5 = new ListNode(1);
        expected1.next = expected2;
        expected2.next = expected3;
        expected3.next = expected4;
        expected4.next = expected5;

        ListNode result = solution.reverseList(node1);

        assertEquals(expected1, result);
    }

    @Test
    void test_reverse_linked_list_2() {
        // Input: 1->2->NULL
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;

        // Expected Output: 2->1->NULL
        ListNode expected1 = new ListNode(2);
        ListNode expected2 = new ListNode(1);
        expected1.next = expected2;


        ListNode result = solution.reverseList(node1);

        assertEquals(expected1, result);
    }

    @Test
    void test_reverse_linked_list_3() {
        // Input: NULL
        ListNode node1 = null;

        // Expected Output: NULL
        ListNode expected1 = null;

        ListNode result = solution.reverseList(node1);

        assertEquals(expected1, result);
    }
}