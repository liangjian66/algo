public class DeleteNodeTwo {

    public ListNode deleteNode(ListNode head, int val) {
        if (head == null){
            return  head;
        }
        ListNode prev  = head;
        ListNode curr = head.next;
        while (curr !=null){
            /*需要删除的节点*/
            if (curr.val == val){
                prev.next = curr.next;
            }
            prev = prev.next;
            curr =  curr.next;

        }
        return  head;

    }
}
