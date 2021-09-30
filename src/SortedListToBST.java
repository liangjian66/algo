import java.util.List;

/*有序链表 建立平衡二叉搜索树*/
public class SortedListToBST {

    public  TreeNode sortedListToBST(ListNode head){
        return  buildTree(head,null);
    }



    public  TreeNode buildTree(ListNode left, ListNode right){
        if (left == right){
            return  null;
        }
        ListNode mid = getMid(left,right);
        TreeNode root = new TreeNode(mid.val);
        root.left = buildTree(left,mid);
        root.right = buildTree(mid.next,right);
        return  root;
    }

    /*使用快慢指针获取链表中位数*/
    public ListNode getMid(ListNode left,ListNode right){
        ListNode fast = left;
        ListNode slow = left;
        while (fast != right && fast.next != right){
               fast = fast.next;
               fast = fast.next;
               slow = slow.next;
        }
       return  slow;
    }
}
