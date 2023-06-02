package main.linklist;

/**
 * RemoveNthFromEnd19.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/06/02
 */
public class RemoveNthFromEnd19 {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    return this.removeNthFromEnd_first(head, n);
  }

  private ListNode removeNthFromEnd_first(ListNode head, int n) {
    // 創建虛擬節點作為鏈表的頭節點
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    // 初始化快指針和慢指針
    ListNode fast = dummy;
    ListNode slow = dummy;

    // 將快指針向前移動 n 步
    for (int i = 0; i < n; i++) {
      fast = fast.next;
    }

    // 同時移動快指針和慢指針，直到快指針到達鏈表的末尾
    while (fast.next != null) {
      fast = fast.next;
      slow = slow.next;
    }

    // 刪除倒數第 n 個節點
    slow.next = slow.next.next;

    // 返回新的鏈表的頭節點
    return dummy.next;
  }
}
