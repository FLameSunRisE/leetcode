package test.linklist;

import main.linklist.ListNode;
import main.linklist.RemoveNthFromEnd19;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveNthFromEnd19Test {

  private RemoveNthFromEnd19 solution;

  @BeforeEach
  void setUp() {
    this.solution = new RemoveNthFromEnd19();
  }

  @Test
  public void testRemoveNthFromEnd() {
    // Example 1
    ListNode head1 = new ListNode(1);
    head1.next = new ListNode(2);
    head1.next.next = new ListNode(3);
    head1.next.next.next = new ListNode(4);
    head1.next.next.next.next = new ListNode(5);

    ListNode result1 = solution.removeNthFromEnd(head1, 2);
    Assertions.assertEquals(1, result1.val);
    Assertions.assertEquals(2, result1.next.val);
    Assertions.assertEquals(3, result1.next.next.val);
    Assertions.assertEquals(5, result1.next.next.next.val);
    Assertions.assertNull(result1.next.next.next.next);

    // Example 2
    ListNode head2 = new ListNode(1);

    ListNode result2 = solution.removeNthFromEnd(head2, 1);
    Assertions.assertNull(result2);

    // Example 3
    ListNode head3 = new ListNode(1);
    head3.next = new ListNode(2);

    ListNode result3 = solution.removeNthFromEnd(head3, 1);
    Assertions.assertEquals(1, result3.val);
    Assertions.assertNull(result3.next);
  }
}