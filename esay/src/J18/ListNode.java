package J18;

/**
 * @author sora
 * @create 2021-04-19 9:30
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x){ val = x; }

    public ListNode deleteNode(ListNode head, int val){
        if(head.val == val) return head.next;
        ListNode pre = head;
        ListNode cur = head.next;
        while(cur != null && cur.val != val){
            pre = cur;
            cur = cur.next;
        }
        if( cur != null) pre.next = cur.next;
        return head;
    }

}
