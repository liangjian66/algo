/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
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
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        ListNode curr = head;
        while(curr != null){
            res.add(curr.val);

            curr = curr.next;
        }
        int i = 0;
        int j = res.size()-1;
        while(i<=j){
            if(res.get(i) != res.get(j)){
                return false;
            }
            i++;
            j--;
        
        }
        return true;
    }
}
// @lc code=end

