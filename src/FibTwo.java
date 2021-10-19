public class FibTwo {

    int f1 = 0;
    int f2 = 0;
    int f3 = 1 ;

    public int fib(int n) {
        final int MOD = 1000000007;

        if (n<2){
            return  n;
        }
        for (int i = 1; i < n; i++) {

            f1 = f2;
            f2 = f3;
            f3 = (f1+f2)% MOD;
        }
        return  f3;

    }
}
