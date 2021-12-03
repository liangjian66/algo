import java.util.*;

public class Test {


    public String minWindow(String S, String T) {
        // write code here
        char[] sArr = S.toCharArray();
        char[] tArr = T.toCharArray();
        int len1 = sArr.length;
        int len2 = tArr.length;
        if (len1 < len2 || len1 == 0 || len2 == 0) {
            return "";
        }
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < len2; i++) {
            Character c = tArr[i];
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        int left = 0;
        int right = -1;
        int res = Integer.MAX_VALUE;
        int left_end = -1;
        int right_end = -1;
        while (right < len1 - 1) {
            right++;
            Character c = sArr[right];
            if (sMap.containsKey(c)) {
                sMap.put(c, sMap.getOrDefault(c, 0) + 1);
            } else {
                sMap.put(c, 1);
            }
            while (checkContain(sMap, tMap) && left <= right) {
                Character leftC = sArr[left];
                sMap.put(leftC, sMap.getOrDefault(leftC, 0) - 1);
                if (right - left + 1 < res) {
                    res = right - left + 1;
                    left_end = left;
                    right_end = right;
                }
                left++;

            }
        }
        if (right_end < 0) {
            return "";
        }
        return S.substring(left_end, right_end + 1);
    }

    public boolean checkContain(HashMap<Character, Integer> sMap, HashMap<Character, Integer> tMap) {
        for (Map.Entry<Character, Integer> entry : tMap.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            Integer tMapCount = sMap.getOrDefault(key, 0);
            if (value > tMapCount) {
                return false;
            }
        }
        return true;
    }

    //   abcabc
    public int solve(String a) {
        // write code here
        if (a == null || a == "" || a.length() == 0) {
            return 0;
        }
        char[] arrC = a.toCharArray();
        int len = arrC.length;
        int maxLen = 0;
        for (int i = 0; i <= len; i += 2) {
            for (int left = 0; left <= len - i; left++) {
                int right = left + i - 1;
                if (isMaxString(arrC, left, i)) {
                    maxLen = Math.max(maxLen, i);
                }
            }
        }
        return maxLen;
    }


    public boolean isMaxString(char[] arrC, int left, int len) {
        int rightEnd = left + len / 2;
        for (int i = left; i < rightEnd; i++) {
            int right = i + len / 2;
            char leftC = arrC[i];
            char rightC = arrC[right];
            if (leftC != rightC) {
                return false;
            }
        }
        return true;
    }


    public double maxProduct(double[] arr) {
        int len = arr.length;
        if (arr == null || len == 0) {
            return (double) 0.0;
        }
        double[] maxDp = new double[len];
        double[] minDp = new double[len];
        System.arraycopy(arr, 0, maxDp, 0, len);
        System.arraycopy(arr, 0, minDp, 0, len);

        for (int i = 1; i < len; i++) {
            double num = arr[i];
            maxDp[i] = Math.max(maxDp[i - 1] * num, Math.max(num, minDp[i - 1] * num));
            minDp[i] = Math.min(minDp[i - 1] * num, Math.min(num, maxDp[i - 1] * num));
        }
        double maxProduct = maxDp[0];
        for (int i = 1; i < len; i++) {
            maxProduct = Math.max(maxProduct, maxDp[i]);
        }
        return maxProduct;
    }


    public static void main(String[] args) {
        String S = ")(()())";
        Test test = new Test();

//       [1,2,3,3,3,3,4,5],3
        int[] matrix = new int[]{2, 3};
//        System.out.println(test.longestValidParentheses(S));
    }
    public long subsequence (int n, int[] array) {
        // write code here
        if(array == null || n == 0){
            return 0;
        }
        // 1 选   0 表示不选
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = array[0];
        for (int i = 1; i < n; i++) {
            int num = array[i];
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]);
            dp[i][1] = Math.max(dp[i-1][0]+num,dp[i][1]);

        }
        PriorityQueue
       return Math.max(dp[n-1][0],dp[n-1][1]);
    }
}

public class Solution {
    // 大顶堆   存储数据的左半部分
      PriorityQueue<Integer> leftMaxQueue = new PriorityQueue<Integer>((a,b)->b-a);
      // 小顶堆 存储数据的右半部分
    PriorityQueue<Integer>  rightMinQueue = new PriorityQueue<Integer>((a,b)->a-b);

    public void Insert(Integer num) {
        int len1 = leftMaxQueue.size();
        int len2 = rightMinQueue.size();
        if (len1 == len2){
            if (leftMaxQueue.isEmpty()|| leftMaxQueue.peek()>num){
                leftMaxQueue.add(num);
            }else {
                leftMaxQueue.add(rightMinQueue.poll());
                rightMinQueue.add(num);
            }
        }else {
             // 其实 奇数
            if (leftMaxQueue.peek()>num){
                rightMinQueue.add(leftMaxQueue.poll());
                leftMaxQueue.add(num);
            }else {
                rightMinQueue.add(num);
            }

        }

    }

    public Double GetMedian() {
        int len1 = leftMaxQueue.size();
        int len2 = rightMinQueue.size();
        if (len1 == len2){
            double left = leftMaxQueue.peek();
            double right = rightMinQueue.peek();
            double mid = (left + right)*0.5;
            return  mid;
        }else {
            double lVal = (double)leftMaxQueue.peek();
            return  lVal;
        }

    }
    // 认知类  常识性 问题
    int carry = 0;
    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        ListNode list1  = reverseListNode(head1);
        ListNode list2 = reverseListNode(head2);
        ListNode curr1  = list1;
        ListNode curr2 = list2;
        ListNode guardNode = new ListNode(-1);
        ListNode curr3 = guardNode;
        while (curr1 != null || curr2 != null|| carry!=0){
            int val1 = curr1 != null? curr1.val:0;
            int val2 = curr2 != null? curr2.val:0;
            int sum  = val1 + val2+carry;
            carry = sum/10;
            int temp  = sum%10;
            ListNode node = new ListNode(temp);
            curr3.next = node;
            curr3 = node;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        ListNode headNode = guardNode.next;
        ListNode resNode = reverseListNode(headNode);
        return  resNode;
    }

    public  ListNode reverseListNode (ListNode head){
        if (head == null){
            return  head;
        }
        ListNode prev = null;
        ListNode curr = head;
        if (curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return  prev;
    }

}




