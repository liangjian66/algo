public class OddEvenList {


    public ListNode oddEvenList(ListNode head) {

        if (head == null){
            return  head;
        }

        ListNode evenHead = head.next;
//         odd   even  可以移动的指针
        ListNode odd = head , even = evenHead;
//         交替 赋值
        while (even != null && even.next != null){
              odd.next = even.next;
              odd = odd.next;
              even.next = odd.next;
              even = even.next;

        }
        odd.next = evenHead;
        return  head;

    }

}
