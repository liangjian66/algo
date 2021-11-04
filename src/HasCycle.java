import java.util.Arrays;
// 判断一个链表是否有环： ListNode
class ListNode {
          int val;
     ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}



public class HasCycle {
    public static boolean hasCycle(ListNode head) {
        ListNode p1 = head ;
        ListNode p2 = head ;
        while ((p2 != null) && (p2.next != null)){
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(7);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node2;
        System.out.println(hasCycle(node1));

    }
}
