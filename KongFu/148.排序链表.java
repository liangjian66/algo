/*
 * @lc app=leetcode.cn id=148 lang=java
 *
 * [148] 排序链表
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
    public ListNode sortList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode curr = head;
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(curr != null){
              res.add(curr.val);
             curr = curr.next;
        }
        int[] ans = new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i] = res.get(i);
        }
        Arrays.sort(ans);
        ListNode newHead = new ListNode(ans[0]);
        curr= newHead;
        for(int i=1;i<ans.length;i++){
            ListNode node = new ListNode(ans[i]);
            curr.next = node;
            curr = curr.next;

        }
      return newHead;

    }
}
// @lc code=end

