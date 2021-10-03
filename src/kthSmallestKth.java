import java.util.Arrays;

public class kthSmallestKth {

    public int kthSmallest(int[][] matrix, int k) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] sorted = new int[row * col];

        int index = 0;
        for (int[] rows : matrix){
            for (int num :rows){
                sorted[index++] = num;
            }
        }
        Arrays.sort(sorted);
        return  sorted[k-1];
    }

}
