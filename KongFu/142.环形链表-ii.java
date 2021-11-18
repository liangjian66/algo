/*
 * @lc app=leetcode.cn id=142 lang=java
 *
 * [142] 环形链表 II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.*;
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return head;
        }
        HashSet<ListNode> set = new HashSet<ListNode>();
        ListNode curr = head;
        while(curr != null){
            if(set.contains(curr)){
                return curr;

            }else{
                set.add(curr);
            }
            curr = curr.next;
        }

        return null;
        
    }
}
// @lc code=end

