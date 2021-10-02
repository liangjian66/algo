import java.util.Stack;

public class DailyTemperatures {

/*单调栈： for循环入栈 什么情况下出栈 ： 找到了比栈顶元素大的数的时候出栈 栈里面存储的是下标 当前下标-栈下标就是距离（隔了几天）*/
     public int[] dailyTemperatures(int[] temperatures) {
    int n = temperatures.length;
    int[] array  = new  int[n];
    Stack<Integer>  stack = new Stack<Integer>();
//    int prev = 0;

         for (int i = 0; i < n; i++) {
             while (!stack.isEmpty()&& temperatures[stack.peek()]<temperatures[i]){
                 int prev =    stack.pop();

                 array[prev] = i - prev;
             }
             stack.push(i);

         }


    return  array;
}



    /*暴力解法 ： 考虑问题时候可以先暴力解法 再考虑优化 ，或者其他的数据结构来优化*/
    public int[] dailyTemperaturesTwo(int[] temperatures) {
//        暴力解法
        int n = temperatures.length;
        int[] array  = new  int[n];

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                if (temperatures[j] >temperatures[i]){
                    array[i]  = j-i;
                    break;
                }
            }

        }
        return  array;

    }
}
