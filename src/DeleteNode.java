
/*删除链表的节点：DeleteNode  题解： 双指针解法 */
public class DeleteNode {

    public ListNode deleteNode(ListNode head, int val) {
        if(head.val == val) return head.next;

        ListNode prev = head;
        ListNode cur = head.next;
        while (cur != null){
            if (cur.val == val){
                prev.next = cur.next;
            }
            prev = prev.next;
            cur  = cur.next;
        }
        return  head;

    }
}
