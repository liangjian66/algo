import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNodes {

    public ListNode removeDuplicateNodes(ListNode head) {
        /*边界判断很重要*/
        if (head == null) {
            return head;
        }
        Set<Integer> set = new HashSet<Integer>();
        set.add(head.val);
        ListNode pos = head;
        /*枚举前驱节点*/
        while (pos.next != null) {
            /*当前待删除的节点*/
            ListNode cur = pos.next;
            if (set.add(cur.val)) {
                pos = pos.next;
            } else {
                pos.next = pos.next.next;
            }
        }
        pos.next = null;

        return head;
    }
}
