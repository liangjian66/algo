import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import  java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import  java.util.*;


import demo.Cat;


  interface  Animation{

      void  run();
}

class  Dog implements Animation {
    @Override
    public void run() {
        System.out.println("跑起来");
    }
}

class  GridFriend{
       String name;
      // 通常 都是重量的级别的对象  一辈子  就这样费了
       private  static   GridFriend gf = new GridFriend("xiaosheng");
      private GridFriend(String name){
           this.name = name;
       }
       public  static  GridFriend getInstance(){
          return  gf;
       }

    @Override
    public String toString() {
        return "GridFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Test {



    // 两个数之和
    /**
     * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target
     * 的那两个整数，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     * 你可以按任意顺序返回答案。
     * */
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < len; i++) {
            int num = nums[i];
            int other = target-num;
            if (map.containsKey(other)&&map.get(other)!=i){
                res[0] = map.get(other);
                res[1] = i;
                return  res;
            }
            map.put(num,i);
        }
        return  res;
    }


    public String longestCommonPrefix(String[] strs) {
          int len = strs.length;
          if (strs == null || len == 0){
              return  "";
          }
          String prefix = strs[0];
        for (int i = 1; i < len; i++) {
            prefix = twoCommonPrefix(prefix,strs[i]);
        }
        return  prefix;
    }
    public  String twoCommonPrefix(String str1,String str2){
        int len = Math.min(str1.length(),str2.length());
        int i = 0;
        while (i<len){
            if (str1.charAt(i) == str2.charAt(i)){
                i++;
            }else {
                break;
            }
        }
        return  str1.substring(0,i);
    }


    // 1...100
    public  static int add(int num){
        if (num == 1){
            return  1;
        }
        return  num+add(num-1);
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         if (list1 == null){
             return  list2;
         }
         if ( list2 == null){
             return  list1;
         }
         ListNode preNode = new ListNode(-1);
         ListNode list3 = preNode;
         while (list1 != null && list2 != null){
             if (list1.val<list2.val){
                 list3.next = list1;
                 list1= list1.next;
             }else {
                 list3.next = list2;
                 list2 = list2.next;
             }
             list3 = list3.next;
         }
         if (list1 != null){
             list3.next = list1;
         }
         if (list2 != null){
             list3.next = list2;
         }
         return  preNode.next;
    }

    public boolean hasCycle(ListNode head) {
          if (head == null){
              return  true;
          }
          HashSet<ListNode> set = new HashSet<>();
          ListNode  fast= head;
          ListNode slow = head;
          while (fast != null && (fast.next != null)){

              slow = slow.next;
              fast = fast.next.next;
              if (slow == fast){
                  return  true;
              }
          }
          return  false;
    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return  res;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        while (!deque.isEmpty()){
            int count = deque.size();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                 TreeNode node = deque.pollFirst();
                 arr.add(node.val);
                 if (node.left != null){
                     deque.offerLast(node.left);
                 }
                 if (node.right != null){
                     deque.offerLast(node.right);
                 }
            }
            res.add(arr);
        }
        return  res;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("主函数");
        int[] nums = new int[]{1,2,3,4};
        exchange(nums);
    }

    public int[] printNumbers(int n) {
        int end = (int)Math.pow(10,n)-1;
        int[] res = new int[end];
        for (int i = 0; i < end; i++) {
            res[i] = i + 1;
        }
        return  res;
    }

        public int sumNums(int n) {
        if(n == 1){
            return  1;
        }
        return  n + sumNums(n-1);
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> aMap = new HashMap<>();
        int len1 = ransomNote.length();
        for (int i = 0; i < len1; i++) {
            char ch = ransomNote.charAt(i);
            aMap.put(ch,aMap.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> bMap = new HashMap<>();
        int len2 = magazine.length();
        for (int i = 0; i < len2; i++) {
            char ch = magazine.charAt(i);
            bMap.put(ch,bMap.getOrDefault(ch,0)+1);
        }
        for (Map.Entry<Character,Integer> entry: aMap.entrySet()) {
            char aKey = entry.getKey();
            int aValue = entry.getValue();
            int bVal = bMap.getOrDefault(aKey,0);
            if (aValue>bVal){
                return  false;
            }
        }
        return true;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int ans = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans = Math.max(ans,dfs(grid,i,j));
            }
        }
        return  ans;
    }

    public  int dfs(int[][] grid, int cur_i,int cur_j){
        if (cur_i<0|| cur_i == grid.length || cur_j < 0 || cur_j== grid[0].length || grid[cur_i][cur_j] != 1){
            return  0 ;
        }
        grid[cur_i][cur_j] = 0;
        int[][] path = {{0,-1},{0,1},{-1,0},{1,0}};
        int ans = 1;
        for (int i = 0; i < 4; i++) {
            int[] pathItem = path[i];
            int next_i = cur_i + pathItem[0];
            int next_j = cur_j + pathItem[1];
            ans += dfs(grid,next_i,next_j);
        }
        return  ans;
    }


    private  Map<Integer,String> dataBase  = new HashMap<>();
    private  int id;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        id++;
        dataBase.put(id,longUrl);
        return "http://tinyurl.com/" + id;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int p = shortUrl.lastIndexOf('/') + 1;
        int key = Integer.parseInt(shortUrl.substring(p));
        return dataBase.get(key);
    }


    //    "Let's take LeetCode contest"
    public String reverseWords(String s) {
        StringBuilder ret = new StringBuilder();
        int length = s.length();
        int i = 0;
        Stack<Character> stack = new Stack<>();
        while (i < length){
            while (i < length && s.charAt(i) != ' '){
                stack.push(s.charAt(i));
                i++;
            }
            while (!stack.isEmpty()){
                ret.append(stack.pop());
            }
            while (i < length && s.charAt(i) == ' ') {
                ret.append(' ');
                i++;
            }
        }
        return  ret.toString();
    }
        public int missingNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (i != num){
                return i;
            }
        }
        return -1;
    }

    public  int [][] findContinuousSequence(int target){
        int i = 1;
        int j = 2;
        int s = 3;
        List<int[]> res = new ArrayList<>();
        while (i<j){
            if (s == target){
                int[] ans = new int[j - i + 1];
                for (int k = i; k <=j; k++) {
                    ans[k-i] = k;
                }
                res.add(ans);
            }
            if (s >= target){
                s -= i;
                i++;
            }else {
                j++;
                s += j;
            }
        }
        return  res.toArray(new int[0][]);
    }

    public  int findLUSlength(String[] strs){
        int n = strs.length;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            boolean check = true;
            for (int j = 0; j < n; j++) {
                if (i != j && isSubseq(strs[i],strs[j])){
                    check = false;
                    break;
                }
            }
            if (check){
                ans = Math.max(ans, strs[i].length());
            }
        }
        return  ans;
    }
    public boolean isSubseq(String s , String t){
        int ptS = 0;
        int ptT = 0;
        while (ptS<s.length()&& ptT<t.length()){
            if (s.charAt(ptS) == t.charAt(ptT)){
                ptS++;
            }
            ++ptT;
        }
        return  ptS == s.length();
    }

    public int movingCount(int m, int n, int k) {
        if (k == 0){
            return 1;
        }
        Queue<int[]> queue = new LinkedList<int[]>();
        // 向右和向下的方向数组
        int[] dx = {0,1};
        int[] dy = {1,0};
        boolean[][] vis = new boolean[m][n] ;
        queue.offer(new int[]{0,0});
        vis[0][0] = true;
        int ans  = 1;
        while (!queue.isEmpty()){
            int[] cell = queue.poll();
            int x = cell[0] , y = cell[1];
            for (int i = 0; i < 2; i++) {
                int tx = dx[i] + x;
                int ty = dy[i] + y;
                if (tx < 0 || tx >= m || ty < 0 || ty >= n || vis[tx][ty] || get(tx) + get(ty) > k) {
                    continue;
                }
                queue.offer(new int[]{tx,ty});
                vis[tx][ty] = true;
                ans++;
            }
        }
        return  ans;
    }

    private  int get(int x){
            int res = 0;
            while (x != 0){
                res += x % 10;
                x /= 10 ;
            }
            return  res;
    }

    public static int[] exchange(int[] nums) {
        int len = nums.length;
        if (len == 0 || nums == null) {
            return nums;
        }
        int left = 0;
        int right = len-1;
        while (left<right){
            while (nums[right]%2==0&&left<right){
                right--;
            }
            while (nums[left]%2 == 1 && left<right){
                left++;
            }
            int temp = nums[right];
            nums[right]  = nums[left];
            nums[left] = temp;
        }
        return  nums;
    }

    public int[] sortedSquares(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int num = nums[i]*nums[i];
            list.add(num);
        }
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = list.get(i);
        }
        Arrays.sort(res);
        return  res;
    }
    // "abcabcbb"
    //  "dvdf"
    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (s == null || len == 0){
            return 0;
        }
        int left = 0;
        HashMap<Integer,Character> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < len; i++) {
            while (map.containsValue(s.charAt(i))){
                map.remove(left);
                left++;
            }
            map.put(i,s.charAt(i));
            res = Math.max(res,i-left+1);
        }
        return  res;
    }


    // 1一直加到100

   public void  connect(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection  = DriverManager
                    .getConnection(
                            "jdbc:mysql://localhost:3306/names?characterEncoding=UTF-8",
                            "root", "hanxiao1993");

            System.out.println("连接成功，获取连接对象： " + connection);

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        String sql = "select * from user_tab where name = 'hanxiao'";
//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        ResultSet resultSet = preparedStatement.executeQuery(sql);
//        while (resultSet.next()){
//            System.out.print("[");
//            System.out.print( resultSet.getInt("id")+"\t");
//            System.out.print( resultSet.getString("name")+"\t");
//            System.out.print( resultSet.getInt("age")+"\t");
//            System.out.println("]");
//        }

    }


    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        backtrack(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, StringBuilder cur, int open, int close, int max) {
        if (cur.length() == max * 2) {
            ans.add(cur.toString());
            return;
        }
        if (open < max) {
            cur.append('(');
            backtrack(ans, cur, open + 1, close, max);
            cur.deleteCharAt(cur.length() - 1);
        }
        if (close < open) {
            cur.append(')');
            backtrack(ans, cur, open, close + 1, max);
            cur.deleteCharAt(cur.length() - 1);
        }
    }


    public boolean isValid(String s) {
         int len = s.length();
         HashMap<Character,Character> map = new HashMap<>(){
             {
                 put(')','(');
                 put(']','[');
                 put('}','{');
             }
         };
         Stack<Character>  stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsValue(ch)){
                stack.add(ch);
            }else if (map.containsKey(ch)){
                if (!stack.isEmpty()){
                    char popCh = stack.pop();
                    if (map.get(ch)!= popCh){
                        return false;
                    }
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }



    Map<Character, Integer> symbolValues = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};
    public int romanToInt(String s) {
        int len = s.length();
        if (s == null || len == 0){
            return 0;
        }
        int res = 0;
        for (int i = 0; i < len-1; i++) {
              int currNum =  symbolValues.get(s.charAt(i));
              int nextNum =  symbolValues.get(s.charAt(i+1));
              if (currNum<nextNum){
                  res -= currNum;
              }else {
                  res += currNum;
              }
        }
        int lastNum = symbolValues.get(s.charAt(len-1));
        res += lastNum;
        return  res;
    }
    public int myAtoi(String str) {
        int len = str.length();
        char[]  charArray = str.toCharArray();
        int index = 0;
        while (index<len&&charArray[index] == ' '){
            index++;
        }
        if (index == len){
            return  0;
        }
        int sign = 1;
        char fistChar = charArray[index];
        if (fistChar == '+'){
            index++;
        }else  if (fistChar == '-'){
            index++;
            sign = -1;
        }
        int res = 0;
        while (index<len){
            char currChar = charArray[index];
            if (currChar > '9' || currChar < '0') {
                break;
            }
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (currChar - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (currChar - '0') > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }
            //合法的情况 考虑转换
            res = res*10+sign*(currChar-'0');
            index++;
        }
        return  res;
    }




    public List<Integer> findAnagrams(String s, String p) {
           int sLen = s.length();
           int pLen = p.length();
        List<Integer> ans = new ArrayList<>();
        if (sLen <pLen){
             return  ans;
            }
           int[] sCount = new int[26];
           int[] pCount = new int[26];

        for (int i = 0; i < pLen; i++) {
            ++sCount[s.charAt(i)-'a'];
            ++pCount[p.charAt(i)-'a'];
        }
        if (Arrays.equals(sCount,pCount)){
            ans.add(0);
        }
        for (int i = 0; i < sLen-pLen; i++) {
            --sCount[s.charAt(i)-'a'];
            ++sCount[s.charAt(i+pLen)-'a'];
            if (Arrays.equals(sCount,pCount)){
                ans.add(i+1);
            }
        }
        return  ans;
    }

    public String longestPalindrome(String s) {
          int len = s.length();
          if (len<2)  return  s;
          int maxLen = 1;
          int begin  = 0;
          boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        char[] charArray = s.toCharArray();
        for (int l = 0; l <=len; l++) {

            for (int i = 0; i < len; i++) {
                int j  = l+i-1;
                if (j>=len){
                    break;
                }
                if (charArray[i] != charArray[j]){
                    dp[i][j] = false;
                }else {
                    if (j-i<3){
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                if (dp[i][j]&&j-i+1>maxLen){
                    maxLen = j-i+1;
                    begin = i;
                }
            }
        }
        return  s.substring(begin,begin+maxLen);
    }
    public  boolean isPalindrome(String s){
        int len = s.length();
        if (len<2) return  true;
        int left = 0;
        int right = len-1;
        while (left<=right){
            if (s.charAt(left)!=s.charAt(right)){
                return  false;
            }
            left++;
            right++;
        }
        return  true;
    }
}