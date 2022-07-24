package J22;

/**
 * @author sora
 * @create 2021-04-23 9:58
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode (int x){ val = x;}

    public ListNode getKthFromEnd(ListNode head, int k){
        ListNode pre = head, last = head;
        for (int i = 0;i < k;i++){
            pre = pre.next;
        }
        while (pre != null){
            pre = pre.next;
            last = last.next;
        }
        return last;
    }
}
