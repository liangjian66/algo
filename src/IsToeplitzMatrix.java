public class IsToeplitzMatrix {
/*对角线 判断是否相等 */
    public boolean isToeplitzMatrix(int[][] matrix) {
        if (matrix == null){
            return false;
        }
        int row = matrix.length;
        int col  = matrix[0].length;
        for (int i = 0; i < row-1; i++) {
            for (int j = 0; j < col-1; j++) {
                if (matrix[i][j] != matrix[i+1][j+1] ){
                    return  false;
                }
            }
        }
           return  true;
    }
}
