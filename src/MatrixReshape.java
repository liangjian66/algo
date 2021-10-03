
/*重塑矩阵*/

public class MatrixReshape {

    public int[][] matrixReshape(int[][] nums, int r, int c) {

        int m = nums.length;
        int n = nums[0].length;
        if (m*n != r*c){
            return  nums;
        }

        int[][] ans = new int[r][c];
        for (int i = 0; i < m*n; i++) {
            ans[i/c][i%c] = nums[i/n][i%n];
        }
       return  ans;
    }

}
