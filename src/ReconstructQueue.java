import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class ReconstructQueue {
/*
* 解题思路 ： 先排序  再插入
*1. 排序规则 ： 按照H高度降序列   假设H高度相等  按照K个数的升序排序
* 2. 遍历排序后的数组 ，， 根据K插入到K 的位置上
*
* 核心思想：  保持独立思考  高个子先占好位 矮个子插入到K位置上  前面肯定有K个高个子，，矮个子再插到前面也满足K的要求
* */
    public  int[][] reconstructQueue(int[][]  people){
        Arrays.sort(people, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);
        LinkedList<int[]> list = new LinkedList<>();

        for (int[] i:people){
            list.add(i[1],i);
        }
        return  list.toArray(new int[list.size()][2]);
    }
}
