/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
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
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        ListNode guardNode = new ListNode(-1);
        guardNode.next = head;
        ListNode temp = guardNode;
        while(temp.next != null){
            if(temp.next.val == val){
                temp.next =  temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return guardNode.next;

    }
}
// @lc code=end

