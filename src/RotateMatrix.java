public class RotateMatrix {

    public void rotate(int[][] matrix) {
               int n = matrix.length;
               int[][] matrixNew = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                /*i  代表行 j 代表列 */
//                matrix[i][j] 旋转90度 得到 matrixNew[j][n-1-i];
                matrixNew[j][n-1-i] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                matrix[i][j] = matrixNew[i][j];
            }
        }
    }

}
