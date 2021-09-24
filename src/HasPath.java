
/*矩阵中的路径：*/
public class HasPath {

    private  final  static  int[][] next = {{0,-1},{0,1},{-1,0},{1,0}};
    private  int rows;
    private  int cols;
    public  boolean hasPath(String val,int rows,int ,String path){
        if (rows == 0 || cols == 0)  return  false;
        this.rows = rows;
        this.cols = cols;
        char[] array = val.toCharArray();
//        建立字符串矩阵
        char[][] matrix = buildMatrix(array);
//       路径字符串数组
        char[]  pathList = path.toCharArray();
        boolean[][] marked = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            
        }

    }

//    建立矩阵
    public  char[][] buildMatrix(char[] array){
        char[][] matrix = new char[rows][cols];
        for (int r = 0,idx = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = array[idx++];
            }
            
        }

        return  matrix;
    }


}
