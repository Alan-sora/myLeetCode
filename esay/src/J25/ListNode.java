package J25;

/**
 * @author sora
 * @create 2021-04-23 10:38
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode (int x) {
        val = x;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode res = new ListNode(0);
        ListNode cur = res;
        while(l1 != null && l2 != null ){
            if(l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if(l1 != null){
            cur.next = l1;
        }else {
            cur.next = l2;
        }
        return res.next;
    }
}
