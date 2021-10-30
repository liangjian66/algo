public class FindNumberIn2DArrayTwo {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
            if (matrix == null || matrix.length==0){
                return  false;
            }
            int row = matrix.length;
            int col = matrix[0].length;

        int  i =0;
        int j = col-1;
        while (i<row && j>=0){
            int temp = matrix[i][j];
            if (temp==target){
                return  true;
            }else if (target>temp){
                i++;
            }else  if (target <temp){
                j--;
            }
        }
        return  false;
    }

}
