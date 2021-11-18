/*
 * @lc app=leetcode.cn id=82 lang=java
 *
 * [82] 删除排序链表中的重复元素 II
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode  guardNode = new ListNode(0);
        guardNode.next = head;
        ListNode curr = guardNode;
        while(curr.next != null && curr.next.next != null){
            if(curr.next.val == curr.next.next.val){
                int tempVal = curr.next.val;
                while(curr.next != null &&(curr.next.val == tempVal)){
                    curr.next = curr.next.next;
                }

            }else{
                curr = curr.next;
            }
        }

        return guardNode.next;

    }
}
// @lc code=end

