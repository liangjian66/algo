import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class DeleteNodeTwo {

    public ListNode deleteNode(ListNode head, int val) {
//        if (head == null){
//            return  head;
//        }
//        if (head.val == val){
//            head = head.next;
//        }
//        ListNode prev  = head;
//        ListNode curr = head.next;
//        while (curr !=null){
//            /*需要删除的节点*/
//            if (curr.val == val){
//                prev.next = curr.next;
//            }
//            prev = prev.next;
//            curr =  curr.next;
//
//        }
//        return  head;

        if (head.val == val){
            head = head.next;
        }
        Deque<ListNode> deque =  new LinkedList<ListNode>();
        ListNode curr = head;
        while (curr!=null){
            if (curr.val!=val){
                deque.offer(curr);
            }
            curr = curr.next;

        }
        ListNode prev = head;

        while (!deque.isEmpty()){
            prev.next = deque.poll();
            prev = prev.next;
        }
        prev.next = null;


        return head;
    }
}
