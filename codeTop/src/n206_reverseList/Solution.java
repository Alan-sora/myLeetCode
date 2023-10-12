package n206_reverseList;

import domain.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode res = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = res;
            res = cur;
            cur = tmp;
        }
        return res;
    }
}
