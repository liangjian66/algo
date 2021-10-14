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
}
