/*合并两个有序链表：mergeTwoLists  归并排序思路*/



//public class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}


public class MergeTwoLists {

//    思路 和 归并排序差不多
    public  ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;

        while (l1 !=null && l2 !=null){
            if (l1.val<l2.val){
                prev.next = l1;
                l1 = l1.next;
            }else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
//        合并后l1 和 l2 最多只有一个还未被合并完 ，我们直接将链表末尾指向未合并的链表即可
        prev.next = l1==null?l2:l1;
        return  prehead.next;
    }


    public ListNode mergeTwoListsTwo(ListNode l1, ListNode l2) {
        if(l1 == null && l2 !=null ){
            return l2;
        }
        if(l2 == null && l1 !=null ){
            return l1;
        }
        if(l1==null &&(l2==null)){
            return null;
        }
        //   ListNode node = null;
        //   if(l1.val)

        ListNode node = l1.val < l2.val?l1:l2;
        ListNode prev = node;
        if(l1.val < l2.val){
            node.next = mergeTwoLists(l1.next,l2);
        }else{
            node.next= mergeTwoLists(l1,l2.next);
        }

        return prev;

    }


}
