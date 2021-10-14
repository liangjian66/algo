
import  java.util.Stack;
public class GetKthFromEnd {

    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null){
            return null;
        }
        ListNode leftP = head;
        ListNode rightP = head;
        for (int i = 0; i < k; i++) {
            rightP = rightP.next;
        }
        while (rightP != null){
            leftP = leftP.next;
            rightP = rightP.next;
        }
        return  leftP;
    }


    public ListNode ReverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode curr = head;
        Stack<ListNode>  stack  = new Stack<ListNode>();
        while(curr != null){
            stack.push(curr);
            curr = curr.next;
        }
        ListNode temp = new ListNode(-1);
        ListNode p = temp;
        while(!stack.isEmpty()){
            ListNode node = stack.pop();
            p.next = node;
            p = p.next;
        }
        return temp.next;
    }
}
