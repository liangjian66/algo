public class JudgeSquareSum {

    public boolean judgeSquareSum(int c) {
        int i = 0;
        long j = (long) Math.sqrt(c);

        while (i<=j){
            if (i*i + j*j>c){
                j--;
            }else if(i*i + j*j<c){
                i++;
            }else {
                return true;
            }
        }
        return false;
    }
}
