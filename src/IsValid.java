import java.util.*;

public class IsValid {

    public boolean isValid(String s) {
         if (s == null){
             return  false;
         }
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }



//         char[] s1 = s.toCharArray();
//        char[] s2 = s.toCharArray();
//        Stack<Character> stack = new Stack<Character>();
//        Queue<Character>  queue = new LinkedList<Character>();
        Map<Character, Character> pairs = new HashMap<>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};


// 左括号  入栈  右括号 出栈  peek不等于 value 返回 false    栈为空返回true
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();

    }
}
