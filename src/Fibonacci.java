

/*利用动态规划的思路*/
public class Fibonacci {

    public  int fnb(int n){
         if (n<2){
             return  n;
         }
        int f1 = 0, f2 = 0, result = 1;
        for (int i = 2; i <=n ; i++) {
            f2=f1;
            f2=result;
            result = f1+f2;
            
        }
         return result;
    }
}
