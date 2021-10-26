import java.util.Stack;

public class ReverseWords {
    public static String reverseWords(String s) {
        if (s == null){
            return  s;
        }
        /*去除首尾空格*/
        s=s.trim();
        String[] arr = s.split("\\s+");
        Stack<String>  stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i]=="") ||!(arr[i].length()==0 )){
                stack.push(arr[i]);
            }
        }
        StringBuffer buff = new StringBuffer();
        while (!stack.isEmpty()){
            String temp = stack.pop();
            buff.append(temp);
            if (stack.size()>0){
                buff.append(" ");
            }
        }
      return  buff.toString();
    }

    public static void main(String[] args) {
        String s =  "a good   example";
        String temp = reverseWords(s);
         System.out.println(temp);
    }
}
