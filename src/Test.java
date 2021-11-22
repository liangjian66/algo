import java.util.*;

public class Test {
    public String LCS (String s1, String s2) {
        char[] s1Arr  = s1.toCharArray();
        char[] s2Arr  = s2.toCharArray();
        int len1 = s1Arr.length;
        int len2 = s2Arr.length;
        if (s1 == null || s2 == null || len1==0|| len2==0){
            return "-1";
        }
        int[][] dp = new int[len1+1][len2+1];
        int maxLen = 0;
        int s1End = 0;
        int s2End = 0;
        for (int i = 1; i < len1+1; i++) {
            char c1 = s1Arr[i-1];
            for (int j = 1; j < len2+1; j++) {
                char c2 = s2Arr[j-1];
                if (c1 == c2){
                    dp[i][j] = dp[i-1][j-1]+1;

                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
                if (dp[i][j]>maxLen){
                    maxLen = Math.max(maxLen,dp[i][j]);
                     s1End = i;
                     s2End = j;
                }
            }
        }
        //找出一个最长的公共子序列
        StringBuilder sb = new StringBuilder();
        int s1L = len1, s2L = len2;
        while(s1L != 0 && s2L != 0){
            if (s1.charAt(s1L-1) == s2.charAt(s2L-1)){
                sb.append(s1.charAt(s1L - 1));
                s1L--;
                s2L--;
            }else{
                if (dp[s1L-1][s2L] > dp[s1L][s2L-1]){
                    s1L--;
                }else{
                    s2L--;
                }
            }
        }
        if(sb.length() == 0)
            return "-1";
        return sb.reverse().toString();
    }

    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        int len = S.length;
        if (S == null || len == 0){
            return  res;
        }
        Deque<Integer>  path = new ArrayDeque<>();
        dfs(S,0,path,res);
        return  res;
    }

    public  void  dfs(int[] nums,int start,Deque<Integer> path,ArrayList<ArrayList<Integer>> res){
        if (start > nums.length){
            return;
        }
        ArrayList<Integer> array = new ArrayList(path);
        res .add(array);
        for (int i = start;i<nums.length;i++){
               int num  = nums[i];
               path.addLast(num);
               dfs(nums,i+1,path,res);
               path.removeLast();
        }
    }


    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        int len = num.length;
        ArrayList<Integer> res = new ArrayList<>();
        if (num == null || len == 0){
            return  res;
        }
//       存储的数组的下标
        Deque<Integer>  deque = new ArrayDeque<>();
        
        for (int i = 0; i < size; i++) {
            int item  = num[i];
            while (!deque.isEmpty()&&num[deque.peek()]<=item){
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        int  WindowLen = len-size+1;
        for (int i = 0; i < len-size+1; i++) {
              int left =  i;
              int right = left+size-1;
            int right_num = num[right];
            while (!deque.isEmpty()&&num[deque.peekLast()]<=right_num){
                deque.pollLast();
            }
            deque.offerLast(right);

            while(left>deque.peek()){
                deque.pollFirst();
            }
            res.add(num[deque.peek()]);
        }
       return  res;
    }

    public static void main(String[] args) {
        Test test = new Test();
      ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        node1.next = node2;

        List<Integer> res = new ArrayList<>();
        res.toArray();
        int[] nums = new int[]{2,3,4,2,6,2,5,1};
        System.out.println(test.maxInWindows(nums,3));
    }
}

