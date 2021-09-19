/*相交链表 ：GetIntersectionNode  题解：HashSet */

import java.util.HashSet;
import java.util.Set;

public class GetIntersectionNode {

    public  ListNode getInterSectionNode(ListNode headA,ListNode headB){
        Set<ListNode>  visited = new HashSet<ListNode>();
        ListNode  temp = headA;
        while (temp != null){
            visited.add(temp);
            temp = temp.next;
        }

        temp = headB;
        while (temp != null){

            if (visited.contains(temp)){
                /*相交*/
                return  temp;
            }
            temp = temp.next;
        }
          return  null;
    }
}
