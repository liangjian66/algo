public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null){
            return  head;
        }

        ListNode low = new ListNode(-1);
        low.next = head;
        ListNode slow = low;
        ListNode fast = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;

        }

        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
         return  low.next;
    }
}
