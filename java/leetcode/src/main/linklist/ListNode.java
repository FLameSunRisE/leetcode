package main.linklist;

/**
 * ListNode-列表节点.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/03/03
 */
public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ListNode)) {
            return false;
        }
        ListNode other = (ListNode) obj;
        ListNode cur1 = this;
        ListNode cur2 = other;
        while (cur1 != null && cur2 != null) {
            if (cur1.val != cur2.val) {
                return false;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1 == null && cur2 == null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + val;
        result = prime * result + ((next == null) ? 0 : next.hashCode());
        return result;
    }
}
