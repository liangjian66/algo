
/*两两交换链表中的节点   递归*/
/*递归 */
public class SwapPairs {

    public  ListNode swapPairs(ListNode head){
        if (head == null || head.next == null){
            return  head;
        }
        ListNode newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return  newHead;
    }
/*  迭代解法 实质就是指针不断交换*/
    public  ListNode swapPairsTwo(ListNode head){
        ListNode  dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while (temp.next != null && temp.next.next != null){
            ListNode node1 = temp.next;
            ListNode node2 = temp.next.next;
            temp.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            temp  = node1;
        }
          return  dummyHead.next;
    }

}
