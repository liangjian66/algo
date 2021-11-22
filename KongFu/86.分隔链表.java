/*
 * @lc app=leetcode.cn id=86 lang=java
 *
 * [86] 分隔链表
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
    public ListNode partition(ListNode head, int x) {
        if(head == null){
            return head;
        }
        ListNode smallHead = new ListNode(-1); 
        ListNode bigHead = new ListNode(-1); 
        ListNode  curr = head;
        ListNode smallPtr = smallHead;
        ListNode  bigPtr = bigHead;
        while(curr !=null){
                ListNode temp = curr;
                int value = temp.val;
                if(value<x){
                    ListNode l1 = new ListNode(value);
                    smallPtr.next = l1;
                    smallPtr = l1;

                }else{
                    ListNode l2 = new ListNode(value);
                    bigPtr.next = l2;
                    bigPtr = l2;
                }
                curr = curr.next;
        }
        smallPtr.next =  bigHead.next;
        return smallHead.next;


    }
}
// @lc code=end

