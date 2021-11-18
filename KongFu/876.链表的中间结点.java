/*
 * @lc app=leetcode.cn id=876 lang=java
 *
 * [876] 链表的中间结点
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
    public ListNode middleNode(ListNode head) {
        if(head == null){
            return head;
        }
        int i = 0;
        ListNode curr = head;
        while(curr !=null){
            i++;
            curr = curr.next;
        }
        // System.out.println(i);
        int mid = 0;
        if(i%2==0){
            mid=  (i-1)/2+1;
        }else{
            mid = (i-1)/2;
        }
        int j= 0;
        ListNode ptr = head;

        while(ptr != null){
            if(j==mid){
                return ptr;
            }
            ptr  = ptr.next;
            j++;

        }
        return head;

    }
}
// @lc code=end

