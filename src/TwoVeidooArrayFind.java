
/*二维数组中的查找： TwoVeidooArrayFind 其实就是矩阵 ，以及坐标*/
public class TwoVeidooArrayFind {

    public static   boolean find(int target,int[][] array){
        //边界条件判断
        if (array == null ||array.length == 0 || array[0] == null || array[0].length==0){
            return  false;
        }
        // 获取函数矩阵的行数 m 列数 n
        int m = array.length; int n = array[0].length;
//        初始化一开始的元素位置 ，这里我们设置为矩阵最右上角的元素
//        i  为纵坐标
//        j 为横坐标
        int i = 0; int j = n-1;
        while (i<m&&j>=0){
            if (target<array[i][j]){
                j--;
            }else if(target>array[i][j]){
                i++;
            }
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,2,8,9},{2,4,9,12}};
        System.out.println(find(5,nums));
    }
}
