/*
 * @lc app=leetcode.cn id=445 lang=java
 *
 * [445] 两数相加 II
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
    Stack<Integer>  stack1 = new Stack();
    Stack<Integer>  stack2 = new Stack();
    int carry = 0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode curr = l1;
         while(curr != null){
             stack1.push(curr.val);
             curr = curr.next;
         }

         ListNode ptr = l2;
         while(ptr != null){
             stack2.push(ptr.val);
             ptr = ptr.next;
         }
         ListNode guardNode = new ListNode(-1);
         ListNode temp = guardNode;

         while(!stack1.isEmpty()|| !stack2.isEmpty()||carry !=0){
             int a = stack1.isEmpty()?0:stack1.pop();
             int b = stack2.isEmpty()?0:stack2.pop();
             int sum = a+b+carry;
             int value = sum%10;
             carry = sum/10;
             ListNode node = new ListNode(value);
            ListNode nextNode = temp.next;
            temp.next = node;
            node.next = nextNode; 
         }

         return temp.next;
    }
}
// @lc code=end

