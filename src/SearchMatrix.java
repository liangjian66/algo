public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
                   if (matrix == null){
                       return  false;
                   }
                   int m = matrix.length;
                   int n = matrix[0].length;
                   int i = 0 ; int j =  n-1;
                   while (i<m &&j>=0){
                       int temp = matrix[i][j];
                       if (target>temp){
                            i++;
                       }else if (target<temp){
                           j--;
                       }else {
                           return  true;
                       }
                   }
                   return  false;

    }

}
