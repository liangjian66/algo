public class SpiralOrder {

    public  int[] spiralOrder(int[][] matrix){
        if (matrix.length == 0 )  return  new int[0];
         /*左上右下*/
        int left = 0;
        int top = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;
        int x = 0;
        int[] res = new int[(right+1)*(bottom+1)];
        while (true){
            /*left  to right*/
            for (int i = left; i <=right ; i++) {
                res[x++] = matrix[top][i];
            }
            if (++top>bottom) break;
            /*top  to bottom*/
            for (int i = top; i <=bottom; i++) {
                res[x++] = matrix[i][right];
            }
            if (left>--right)  break;

            /*right to left*/
            for (int i = right; i >=left ; i--) {
                res[x++] = matrix[bottom][i];
            }
            if (top>--bottom)  break;
            
            /*bottom to top*/
            for (int i = bottom; i >=top ; i--) {
                res[x++] = matrix[i][left];
            }
            if (++left>right) break;

        }
        return res;
    }
}
