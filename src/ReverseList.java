
/*单链表反转：ReverseList    事先存储其前一个节点 */
public class ReverseList {


    public ListNode reverseList(ListNode head){
        ListNode prev  = null;
        ListNode cur = head;
        while (cur != null){
//           先记录 cur 下一个节点
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;

        }
        return prev;
    }


    private  class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val){this.val = val;}
        ListNode(int val,ListNode next){this.val = val ; this.next = next;}
    }
}
