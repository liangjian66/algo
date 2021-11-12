/*
 * @lc app=leetcode.cn id=23 lang=java
 *
 * [23] 合并K个升序链表
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
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if(lists == null|| lists.length == 0){
            return null;
        }

        return merge(lists,0,len-1);

    }

    public ListNode merge(ListNode[] lists,int left,int right){
        if(left==right){
            return lists[left];
        }
        if(left>right){
            return null;
        }
        int mid = left + (right - left)/2;
       ListNode leftNode =  merge(lists,left,mid);
       ListNode rightNode =  merge(lists,mid+1,right);
       return MergeTwoList(leftNode,rightNode);
    }

    public ListNode MergeTwoList(ListNode list1,ListNode list2) {
        if(list1 == null && list2 ==null){
            return list1;
        }
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
    ListNode head = new ListNode(0);
        ListNode tail =head;
        ListNode left = list1;
        ListNode right = list2;
        while(left != null && right != null){
              if(left.val<=right.val){
                  tail.next = left;
                  left = left.next;
              }else{
                  tail.next = right;
                  right = right.next;
              }
              
            tail = tail.next;
        }
        tail.next = left==null?right:left;
        return head.next;
    }
}
// @lc code=end

