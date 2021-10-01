
/*分割链表   先考虑简单情况  再考虑复杂情况*/

public class SplitListToParts {
    public  ListNode[] splitListToParts(ListNode head,int k){

//        第一步计算链表的个数
        int n = 0;
//        定义一个新的指针  head不能动
        ListNode temp = head;
        while (temp != null){
            n++;
            temp = temp.next;
        }
//        计算商 余数
        int shang = n/k , remainder = n%k ;
//      创建存放链表的数组
        ListNode[] res  = new ListNode[k];
        ListNode curr = head;
        for (int i = 0; i < k&&curr !=null; i++) {
            res[i] = curr;
//            9 : 3 3 3 10 : 4 3  3 11 : 4 4 3
//            以上规律
            int partSize = shang + (i<remainder?1:0) ;
            for (int j = 1; j < partSize; j++) {
                curr = curr.next;
            }
            ListNode next = curr.next;
            curr.next = null;
            curr = next;

        }
        return  res;
    }
}
