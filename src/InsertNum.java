public class InsertNum {

    /*向有序链表插入新的节点*/
    public  Node insertNode(Node head, int num){
        Node node = new Node(num);
        /*一定要考虑边界情况*/
        if (head == null){
            node.next = node;
            return  node;
        }
        Node prev = head;
        Node curr = head.next;
        while (curr != head){
            if (prev.val<=num&&curr.val>=num){
                break;
            };
            prev = curr;
            curr = curr.next;
        }
        prev.next = node;
        node.next = curr;
        /*一定要处理边界情况*/
        return  head.val<num?head : node;

    }
    public static void main(String[] args) {
        System.out.println("adsf");
    }
}
