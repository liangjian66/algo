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


    public static void main(String[] args) throws ClassNotFoundException, SQLException {




//        try {
//            int[] arr = new int[1];
//            arr[1]  = 9;
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }

        Class.forName("");

        int[] arr = new int[1];
        arr[1]  = 9;

        System.out.println("异常处理");


    }

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

    public String longestCommonPrefix(String[] strs) {
         if (strs == null || strs.length == 0){
             return  "";
         }
         String prefix = strs[0];
         int count = strs.length;
        for (int i = 1; i <count ; i++) {
            prefix =  longestCommonPrefix(prefix,strs[i]);
            if (prefix.length() == 0){
                break;
            }
        }
        return  prefix;
    }
    public  String longestCommonPrefix(String str1,String str2){
        int len = Math.min(str1.length(),str2.length());
        int index = 0;
        while (index <len &&str1.charAt(index) == str2.charAt(index)){
            index++;
        }
        return  str1.substring(0,index);
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


        public int[] twoSum(int[] nums, int target) {
        int len =  nums.length;
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        for (int i = 0; i < len; i++) {
            int num = nums[i];
            int other = target - num;
            if (map.containsKey(other)&&map.get(other)!=i){
                return  new int[]{map.get(other),i};
            }
            map.put(num,i);
        }
        return  new int[]{-1,-1};
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

    public int lengthOfLongestSubstring(String s) {
       char[] arr = s.toCharArray();
       int len = arr.length;
       int right = -1;
       int ans = 0;
       // i是起点
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            if (i!=0){
                set.remove(arr[i-1]);
            }
            while (right+1<len && !set.contains(arr[right+1]) ){
                set.add(arr[right+1]);
                right++;
            }
            ans = Math.max(ans,right-i+1);
        }
        return ans;
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