/*
 * @lc app=leetcode.cn id=92 lang=java
 *
 * [92] 反转链表 II
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
             if(head == null || left>right){
                 return head;
             }
             int len = right - left;
             ListNode curr = head;
            ArrayList<Integer> res = new ArrayList<>();
            while(curr != null){
                res.add(curr.val);
                curr = curr.next;
            }
            int i = left-1;
            int j = right-1;
            while(i<=j){
                int temp = res.get(i);
                res.set(i,res.get(j));
                res.set(j,temp);
                i++;
                j--;
            }
            int index = 0;
            ListNode guardNode = new ListNode(0);
            ListNode ptr = guardNode;

            while(index<res.size()){
                ptr.next =  new ListNode(res.get(i));
                ptr = ptr.next;
                index++;
            }
            return guardNode.next;
             
    }
}
// @lc code=end

