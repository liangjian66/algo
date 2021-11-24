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
import java.util.*;

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null){
            return head;
        }
        ListNode curr = head;
        ListNode fast = head;
        ListNode firstNode = head;
        List<ListNode> res = new ArrayList<>();
        int count = 0;
        while(fast != null){
            
            if(count%k == 0){
                curr  = fast;
                firstNode  = curr;
                int index = 0;
                while(index<k-1&&(fast !=null)){
                    curr = curr.next;
                    fast = fast.next;
                    index++;
                    count++;
                }
                if(fast != null){
                  fast = fast.next;
                }
                if(curr !=null){
                    curr.next = null;
                }
                res.add(firstNode);
            }else{
                curr = curr.next;
                fast = fast.next;
            }
            count++;
        }

        ArrayList<ListNode> ans = new ArrayList<>();
        ListNode lastNode  = res.get(res.size()-1);
        int lastCount = 0;
        while(lastNode!=null){
            lastNode = lastNode.next;
            lastCount++;
        }

        for(int i =0;i<res.size();i++){
            ListNode node = null;
            if((i== res.size()-1) &&lastCount<k){
                node = res.get(i);
            }else{
                node =  reverseListNode(res.get(i));
            }
            
            ans.add(node);
        }
        Deque<ListNode> deque = new ArrayDeque();
        for(int i=0;i<ans.size();i++){
            ListNode node = ans.get(i);
            ListNode ptr = node;
            while(ptr != null){
                deque.addLast(ptr);
                ptr  = ptr.next;
            }
        }
        ListNode  guard = new ListNode(0);
        ListNode ptr  = guard;
        while(!deque.isEmpty()){
              ptr.next =  deque.pollFirst();
              ptr = ptr.next;
        }

       return guard.next;
    }

    /**
     * 输入：
     * [[1,2,3],[4,5,6],[7,8,9]]
     * 复制
     * 返回值：
     * [1,2,3,6,9,8,7,4,5]
     * @param node
     * @return
     */
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new  ArrayList<>();
        int len = matrix.length;
        if (matrix == null || len == 0){
            return  res;
        }
        int left = 0;
        int right = matrix[0].length;
        int top = 0;
        int bottom = matrix.length-1;
        while (true){
            while (left<=right){
                int val = matrix[top][left++];
                res.add(val);
            }
            if (++top>bottom) break;
            while (top<bottom){
                int val = matrix[top++][right];
                res.add(val);
            }
            if (--right<left)break;
            while (left<=right){
                int val = matrix[bottom][right--];
                res.add(val);
            }
            if (top>--bottom) break;
            while (top<=bottom){
                int val = matrix[bottom][left];
                res.add(val);
            }
            if (++left>right) break;
        }

        return  res;
    }



    public ListNode  reverseListNode(ListNode node){
           if(node == null){
               return node;
           }
           ListNode prev = null;
           ListNode curr = node;
           while(curr != null){
               ListNode next = curr.next;
               curr.next = prev;
               prev = curr;
               curr = next;
           }
           return prev;
    }
}
// @lc code=end

