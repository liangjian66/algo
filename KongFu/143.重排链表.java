/*
 * @lc app=leetcode.cn id=143 lang=java
 *
 * [143] 重排链表
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
    public void reorderList(ListNode head) {
          if(head == null){
              return;
          }
          ListNode curr = head;
          ArrayList<ListNode> res = new ArrayList<>();
          while(curr != null){
              res.add(curr);
              curr  = curr.next;
          }
          int left = 0;
          int right = res.size()-1;
          while(left <right){
              ListNode leftNode = res.get(left);
              ListNode  nextNode = leftNode.next;
              ListNode rightNode = res.get(right);
              leftNode.next = rightNode;
              rightNode.next =  nextNode;
              if(left == right) break;
              left++;
              right--;

          }
          res.get(left).next = null;


    }
}
// @lc code=end

