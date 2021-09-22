import java.util.Stack;

/*面试题06. 从尾到头打印链表  ReversePrint  使用栈先进后出的特性 */
public class ReversePrint {

    public static int[] reversePrint(ListNode head){
        Stack<ListNode>  stack = new Stack<ListNode>();

        while (head != null){
            stack.push(head);
            head = head.next;
        }
        int size = stack.size();
        int[] prints = new int[size];
        for (int i = 0; i < size; i++) {
             prints[i] = stack.pop().val;
        }
         return  prints;
    }
}
