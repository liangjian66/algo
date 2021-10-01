/*回文链表*/

import java.util.ArrayList;
import java.util.List;

public class IsPalindrome {

    public boolean isPalindrome(ListNode head) {
          if (head == null){
              return  false;
          }
        List<Integer> res = new ArrayList<Integer>();
          while (head != null){
              res.add(head.val);
              head = head.next;
          }
          int i = 0;
          int j = res.size()-1;
          while (i<j){
              if (res.get(i) != res.get(j)){
                  return false;
              }
              i++;
              j--;
          }

         return true;
    }
}
