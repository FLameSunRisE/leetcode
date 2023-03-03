package leetcode.src.test.linklist;

import leetcode.src.main.linklist.ListNode;
import leetcode.src.main.linklist.MergeTwoSortedLists21;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedLists21Test {

    private MergeTwoSortedLists21 solution;

    @BeforeEach
    public void setUp(){
        this.solution = new MergeTwoSortedLists21();
    }

    @Test
    void testMergeTwoLists() {
        // Test Case 1
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4, new ListNode(4))))));
        ListNode actual = solution.mergeTwoLists(l1, l2);
        assertEquals(expected, actual);

        // Test Case 2
        l1 = null;
        l2 = new ListNode(0);
        expected = new ListNode(0);
        actual = solution.mergeTwoLists(l1, l2);
        assertEquals(expected, actual);

        // Test Case 3
        l1 = null;
        l2 = null;
        expected = null;
        actual = solution.mergeTwoLists(l1, l2);
        assertEquals(expected, actual);
    }
}