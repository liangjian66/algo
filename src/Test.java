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

        int res = 0;
        for (int i = 1; i <=100; i++) {
            res+=i;
        }
//         int res = add(100);

        int len =  lengthOfLongestSubstring("abba");
        System.out.println(len);
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