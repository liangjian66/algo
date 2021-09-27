
/*翻转字符串： 思路 ：双指针解法   栈法*/

import java.util.Stack;

public class ReverseWordsInSentence {

    public  String reverseWords(String s){
//        删除首尾空格
        s = s.trim();
        int j = s.length()-1;
        int i = j;
        StringBuilder res = new StringBuilder();
        while (i>=0){
//          倒叙查找 第一个空格
            while (i>=0&&s.charAt(i)!=' ') i--;
//            找到第一个空格 截取字符串
            res.append(s.substring(i+1,j+1)+' ');
//            跳过单词空格
            while (i>=0 &&s.charAt(i)==' ') i--;
            j = i;
        }
        return  res.toString().trim();
    }
}


//栈法

 class ReverseWordsInSentenceStack{

    public String reverseWords(String s){
//        stack<char>  word = new
        s = s.trim();

        Stack<Character> word = new Stack<Character>();
        StringBuilder res = new StringBuilder();
        for (int i = s.length()-1; i>=0  ; --i) {
             if (s.charAt(i) != ' '){
                 word.push(s.charAt(i));
             }
//             单词出栈
             if (s.charAt(i)==' '||i==0){
                 boolean flag = false; //标记是否发生出栈
                  while (!word.isEmpty()){
                      res.append(word.pop());
                      flag = true;
                  }
                  if (flag){
                      res.append(' ');
                  }

             }
        }

        return res.toString().trim();
    }

}