package J24;

/**
 * @author sora
 * @create 2021-04-23 10:16
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode (int x) {
        val = x;
    }

    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while( cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
