package J06;

import java.util.Stack;

/**
 * @author sora
 * @create 2021-04-13 10:09
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public int[] reversePrint(ListNode head){
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = head;
        while (temp != null){
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        for(int i = 0; i < size; i++){
            print[i] = stack.pop().val;
        }
        return print;
    }
}
