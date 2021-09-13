/*链表的倒数第K节点： KthFromEnd 双指针解法 */

public class KthFromEnd {

    public static  Node findKthFromEnd(Node head , int k){
        Node p1 = head;
        Node p2 = head;
//        把p2 指针移动到正数第n个节点
        for (int i = 1; i < k; i++) {
            p2 = p2.next;
            if (p2 == null){
                throw  new IllegalArgumentException("参数n 超出链表长度");
            }
        }
//        p1 和🏃🏻p2 一起右移 ，直到p2指向链表尾节点
        while (p2.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;

    }

//    快速创建链表
    private  static  Node buildLinkList(int[] array){
        Node head = new Node(array[0]);
        Node p = head;
        for (int i = 1; i < array.length ; i++) {
            p.next = new Node(array[i]);
            p = p.next;
        }
        return  head;
    }
//    链表节点
    private  static  class  Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
   }
}
