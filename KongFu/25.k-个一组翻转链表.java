/*
 * @lc app=leetcode.cn id=25 lang=java
 *
 * [25] K 个一组翻转链表
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
    public ListNode reverseKGroup(ListNode head, int k) {
              if(head == null) return null;
              ListNode a,b;
              a = b  = head;
              for(int i = 0;i<k;i++){
                  // 这里实现了 如果节点总数不是K的整数倍，那么请将最后剩余的节点保持原有顺序
                  if(b == null) return head;
                  b = b.next;
              }
              ListNode newHead = reverse(a,b);
              a.next = reverseKGroup(b,k);
              return newHead;
    }

    ListNode reverse(ListNode a,ListNode b){
        ListNode pre = null ;
        ListNode cur = a;
        ListNode nxt = a;
        while(cur != b){
            nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre;
    }
}
// @lc code=end

