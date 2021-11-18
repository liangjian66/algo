import java.util.*;

public class Test {





    public int[] reversePrint(ListNode head) {
        if(head == null){
            return  new int[0];
        }
        Stack<Integer> stack = new Stack();
        ListNode curr = head;
        while (curr!= null){
            stack.push(curr.val);
            curr = curr.next;
        }
        int[] res = new int[stack.size()];
        int i = 0;

        while (i<res.length){
            res[i] = stack.pop();
            i++;
        }
        return  res;

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
          HashSet<ListNode> set  = new HashSet<>();
        ListNode curr = headA;
        while (curr !=null){
            set.add(curr);
            curr = curr.next;
        }

        ListNode ptr =  headB;
        while (curr !=null){
            if(!set.add(ptr)){
                return  ptr;
            };
            ptr = ptr.next;
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
         res.toArray(int[])
        return  null;
    }


    public static void main(String[] args) {
//
        Test test = new Test();

      ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        node1.next = node2;



        System.out.println(test.reversePrint(node1));

    }
}
