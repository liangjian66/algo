
import java.util.*;

public class RemoveKNum402 {


    public static  String removeKdigits(String num, int k) {
        int newLength = num.length() - k;
        Stack<Integer> tempStack = new Stack<Integer>();
        for (int i = 0; i < num.length(); i++) {
            int c = num.charAt(i);
            if (!tempStack.isEmpty()){
                while (tempStack.peek()>c && k>0){
                    tempStack.pop();
                    k--;
                }
            }

            tempStack.push(c);
        }


        Stack<Integer> twoStack = new Stack<Integer>();

        while (!tempStack.isEmpty()){
            twoStack.push(tempStack.pop());
        }
        StringBuilder builder = new StringBuilder();
        while (!twoStack.isEmpty()){
            builder.append(twoStack.pop());
        }

        System.out.println(builder.toString());
        return builder.toString();
    }

    public static void main(String[] args) {

        removeKdigits("1593212",3);

//        System.out.println();


    }

}
