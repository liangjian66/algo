public class RemoveNthFromEndTwo {

    /**
     *
     * @param head ListNode类
     * @param n int整型
     * @return ListNode类
     */
    public ListNode removeNthFromEnd (ListNode head, int n) {
        if(head == null){
            return head;
        }
        ListNode  left = head;
        ListNode  right = head;
        ListNode newHead = new ListNode(-1);
        ListNode prev = newHead;
        prev.next = left;
        for(int i= 0;i<n;i++){
            right = right.next;
        }
        while(right !=null){
            left = left.next;
            prev = prev.next;
            right = right.next;
        }
        prev.next = left.next;
        return newHead.next;
        // write code here
    }
}
