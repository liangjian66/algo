
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ArrayStrMinDistance {

    public static int minDistance(String[] strs,String str1,String str2){
        if (str1 == null || strs == null){
            return  -1;
        }
        if (str1.equals(str2)){
            return 0;
        }
        int last1 = -1;
        int last2 = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i != strs.length ; i++) {
            if (strs[i].equals(str1)){
                min = Math.min(min,last2==-1?min:i-last2);
                last1 = i;
            }
            if (strs[i].equals(str2)){
                min = Math.min(min,last1==-1?min:i-last1);
                last2 = i;
            }
        }
        return  min == Integer.MAX_VALUE?-1:min;
    }

    public static void main(String[] args){
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        try{
            str = buf.readLine();                       //读取输入内容
        }catch(IOException e){                      //要进行异常处理
            e.printStackTrace();
        }

        System.out.println("输入的内容："+str);

    }


}
