
import java.util.*;

// 对人生欲望的挑战  抓住机会

// 人生 那种挑战的欲望



public class Test {


    public ListNode removeNthFromEnd(ListNode head, int n) {
         if (head == null ) return head;
         ListNode dummy = new ListNode(0);
         dummy.next = head;
         Stack<ListNode> stack = new Stack<>();
         ListNode curr = dummy;
         while (curr != null){
             stack.push(curr);
             curr = curr.next;
         }
        for (int i = 0; i < n; i++) {
            stack.pop();
        }
        ListNode prev = stack.peek();
        prev.next = prev.next.next;
        return  dummy.next;
    }



    public ListNode reverseList(ListNode head) {
         if (head == null || head.next == null) return head;
         ListNode newHead = reverseList(head.next);
         ListNode nextNode = head.next;
         newHead.next = head;
         head.next = null;
         return  newHead;
    }


    public ListNode removeElements(ListNode head, int val) {
           if (head == null)  return  head;
        head.next = removeElements(head.next,val);
        if (head.val == val){
            return  head.next;
        }else {
             return  head;
        }
    }



    public int[][] generateMatrix(int n) {
          int[][] res = new int[n][n];
          int max = n*n;
          int num = 0;
          int left = 0;
          int right = n-1;
          int top = 0;
          int bottom = n-1;
          while (num<max){
              for (int i = left; i <=right ; i++) {
                  num++;
                  res[top][i] = num;
              }
              top++;
              if (top>bottom) break;
              for (int i = top; i <=bottom; i++) {
                  num++;
                  res[i][right] = num;
              }
              right--;
              if (left>right) break;
              for (int i = right; i >=left ; i--) {
                  num++;
                  res[bottom][i] = num;
              }
              bottom--;
              if (top>bottom) break;
              for (int i = bottom; i >=top ; i--) {
                  num++;
                  res[i][left] = num;
              }
              left++;
              if (left>right) break;
          }
          return  res;
    }


     // 滑动窗口解法
    public int minSubArrayLen(int target, int[] nums) {
           int  len = nums.length;
           if (nums == null || len == 0){
               return  0;
           }
           int start = 0;
           int end = 0;
           int ans = Integer.MAX_VALUE;
           int sum = 0;
           while (end<len){
               int endNum = nums[end];
               sum+= endNum;
               while (sum>=target){
                   int temp = end - start+1;
                   ans = Math.min(ans,temp);
                   sum-= nums[start];
                   start++;
               }
               end++;
           }
           if (ans == Integer.MAX_VALUE)return  0;
           return ans;
    }



    public int removeElement(int[] nums, int val) {
         int len = nums.length;

         if (len == 0 || nums == null){
             return 0;
         }
         int left = 0;
        for (int right = 0; right < len; right++) {
            int num = nums[right];
            if (num != val){
                nums[left] = num;
                left++;
            }
        }
        return  left;
    }


    public int search(int[] nums, int target) {
         int len = nums.length;
         if (len == 0|| nums == null){
             return -1;
         }
         int l = 0;
         int r = len-1;
         while (l<=r){
             int mid = l+(r-l)/2;
             if (nums[mid] == target){
                 return  mid;
             }else if (target>nums[mid]){
                   l = mid+1;
             }else if (target<nums[mid]){
                 r = mid-1;
             }
         }
         return  -1;
    }



    boolean res  = true;
    int rootval = 0;
    public boolean isUnivalTree(TreeNode root) {
       if ( root == null) return  true;
       rootval = root.val;
       dfs(root);
       return  res;
    }

    public  void  dfs(TreeNode root){
         if ( root == null) return;
         if (root.val != rootval) res = false;
         dfs(root.left);
         dfs(root.right);
    }




    public TreeNode pruneTree(TreeNode root) {
      if (root == null) return  root;
      boolean isContain =    containOnes(root);
         return  isContain?root:null;
    }

    public  boolean containOnes(TreeNode root){
        if (root == null) return  false;
        boolean l = containOnes(root.left);
        boolean r = containOnes(root.right);
         if (!l) root.left = null;
         if (!r) root.right = null;
         return  root.val == 1 || l || r;

    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
      int len = nums.length;
      if (nums == null || len == 0){
          return true;
      }
      HashMap<Integer,List<Integer>> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int num = nums[i];
            if (map.containsKey(num)){
                List<Integer> list = map.get(num);
                list.add(i);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(num,list);
            }
        }
        for (List<Integer> list: map.values()){
              int size = list.size();
            for (int i = 0; i+1 < size; i++) {
                if (Math.abs(list.get(i+1)-list.get(i))<=k){
                    return  true;
                }
            }
        }

        return  false;
    }




    public int trap(int[] height) {
         int len = height.length;
         if (height == null || len == 0){
             return  0;
         }
         int ans = 0;
         Stack<Integer> stack = new Stack<>();
         // 单调递减栈
        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty()&& height[i]>height[stack.peek()]){
                int cur = stack.pop();
                if (stack.isEmpty()){
                    break;
                }
                int left = stack.peek();
                int width = i-left-1;
                int h = Math.min(height[left],height[i])-height[cur];
                ans+=width*h;
            }
            stack.push(i);
        }
         return  ans;
    }


    public int[] MySort (int[] arr) {
        // write code here
        quick(arr,0,arr.length-1);
        return  arr;

    }

    public void  quick(int[] nums,int i,int j){
        if (i>j){
            return;
        }
        int left = i;
        int right = j ;
        int pviot = nums[left];
        while (left<right){
            while (left<right&&nums[right]>pviot) right--;
            nums[left] = nums[right];
            while (left<right&&nums[left]<=pviot)left++;
            nums[right] = nums[left];
        }
        int mid = left;
        nums[mid] = pviot;
        quick(nums,i,mid-1);
        quick(nums,mid+1,j);
    }



    public static void main(String[] args) {
       String s = " 3/2 ";
        int[] res = new int[]{4,-2,-3,4,1};
        Test test = new Test();
//      System.out.println(test.calculate(s));
    }

}








