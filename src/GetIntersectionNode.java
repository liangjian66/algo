/*相交链表 ：GetIntersectionNode  题解：HashSet */

import java.util.HashSet;
import java.util.Set;

public class GetIntersectionNode {

    /*
    * 指针 A 先遍历完链表 headA ，再开始遍历链表 headB ，当走到 node 时，共走步数为：
    * a + (b - c)
    * a+(b−c)
    * 指针 B 先遍历完链表 headB ，再开始遍历链表 headA ，当走到 node 时，共走步数为：
    * b + (a - c)
    * b+(a−c)
    * 如下式所示，此时指针 A , B 重合，并有两种情况：
    * a + (b - c) = b + (a - c)
    * a+(b−c)=b+(a−c)
    *
    * */

        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode A = headA, B = headB;
            while (A != B) {
                A = A != null ? A.next : headB;
                B = B != null ? B.next : headA;
            }
            return A;
        }

}
