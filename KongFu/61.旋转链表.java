/*
 * @lc app=leetcode.cn id=61 lang=java
 *
 * [61] 旋转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.*;
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return head;
        }
        ArrayList<Integer> res = new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            res.add(curr.val);
            curr = curr.next;
        }
        int[] ans = new int[res.size()];
        int len = res.size();
        for(int i = 0;i<len;i++){
            int  nodeVal = res.get(i);
            int j = (i+k)%len;
            ans[j] = nodeVal;
        }
        ListNode guardNode = new ListNode(-1);

        ListNode ptr = guardNode;
        for(int i= 0;i<len;i++){
            ListNode  node = new ListNode(ans[i]);
            ptr.next = node;
            ptr = ptr.next;

        }
         return guardNode.next;
    }
}
// @lc code=end

