import java.util.*;

public class Test {





    public int[] reversePrint(ListNode head) {
        if(head == null){
            return  new int[0];
        }
        Stack<Integer> stack = new Stack();
        ListNode curr = head;
        while (curr!= null){
            stack.push(curr.val);
            curr = curr.next;
        }
        int[] res = new int[stack.size()];
        int i = 0;

        while (i<res.length){
            res[i] = stack.pop();
            i++;
        }
        return  res;

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
          HashSet<ListNode> set  = new HashSet<>();
        ListNode curr = headA;
        while (curr !=null){
            set.add(curr);
            curr = curr.next;
        }

        ListNode ptr =  headB;
        while (curr !=null){
            if(!set.add(ptr)){
                return  ptr;
            };
            ptr = ptr.next;
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        return  null;
    }


        public int maxEnvelopes(int[][] envelopes) {
            int n = envelopes.length;
            Arrays.sort(envelopes, new Comparator<int[]>() {
                @Override
                public int compare(int[] a, int[] b) {
                    return a[0] == b[0]?b[1]-a[1]:a[0]-b[0];
                }
            });
            // 对高度数组寻找LIS
            int[] height = new int[n];
            for (int i = 0; i < n; i++) {
                height[i] = envelopes[i][1];
            }
            return  lengthOfLIS(height);
       }


    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if(nums == null || len == 0){
            return 0;
        }
        int[] dp = new int[len];
        Arrays.fill(dp,1);
        dp[0]  =1;
        int res  = 1;
        for(int i=0;i<len;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    // dp[i] = dp[j]+1;
                    dp[i] = Math.max(dp[i],dp[j]+1);
                    res = Math.max(res,dp[i]);
                }
            }

        }
        return res;
    }



    public static void main(String[] args) {
//
        Test test = new Test();

      ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        node1.next = node2;



        System.out.println(test.reversePrint(node1));

    }
}
