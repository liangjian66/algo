/*回文链表*/

import java.util.ArrayList;
import java.util.List;

public class IsPalindrome {

    public boolean isPalindrome(ListNode head) {
        if (head == null){
            return  true;
        }
        ListNode curr = head;
        List<Integer> arr = new ArrayList<Integer>();
        while (curr != null){
            arr.add(curr.val);
            curr = curr.next;

        }
        int i = 0;
        int j = arr.size()-1;
        while (i<j){
            if (!arr.get(i).equals(arr.get(j))){
                return  false;
            }
            i++;
            j--;

        }
        return  true;

    }
}
