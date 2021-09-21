
/*迪杰斯特拉 ： dijkstra  思路： 维护一个距离表， 标记是否最短距离 ，动态规划更新最短距离表*/


import java.util.LinkedList;
import java.util.List;

public class Dijkstra {

//    迪杰斯特拉 最短路径算法
    public  static  int[] dijkstra(Graph graph,int   startIndex){
//          图的顶点数量
        int size = graph.vertexes.length;
//        创建距离表，存储从起点 到每一个顶点的临时距离
        int[]  distances = new int[size];
//        记录顶点的遍历状态
        boolean[] access = new  boolean[size];
//        初始化最短路径表 ， 到达每个顶点的路径代价默认为无穷大
        for (int i = 1; i < size; i++) {
            distances[i] = Integer.MAX_VALUE;

        }
//        遍历起点  ，刷新距离表   A->B   A->C
        access[0] = true;
        List<Edge> edgesFromStart = graph.adj[startIndex];
        for (Edge edge: edgesFromStart){
            distances[edge.index] = edge.weight;
        }

//        主循环 ，重复遍历最短距离顶点 和刷新距离表的操作
        for (int i = 1; i < size; i++) {
//            寻找最短距离顶点
            int minDistanceFromStart = Integer.MAX_VALUE;
            int minDistanceIndex = -1;
            for (int j = 1; j < size ; j++) {
//                动态规划 更新最短距离表
                if (!access[j] &&(distances[j]<minDistanceFromStart)){
                      minDistanceFromStart = distances[j];
                      minDistanceIndex = j;
                }
            }
            if (minDistanceIndex == -1){
                break;
            }

//            遍历顶点  ，刷新距离表  更新是否是最短距离表
            access[minDistanceIndex] =   true;
            for (Edge edge : graph.adj[minDistanceIndex]){
                if (access[edge.index]){
                    continue;
                }
                int weight = edge.weight;
                int preDistance = distances[edge.index];
                if ((weight != Integer.MAX_VALUE)&&((minDistanceFromStart+weight)<preDistance)){
                    distances[edge.index]  = minDistanceFromStart + weight;
                }
            }
        }
        return  distances;
    }


    /*图的顶点*/
    private  static  class Vertex{
        String data;
         Vertex(String data){
           this.data =  data;
         }
    }


    private  static  class  Edge{
        int index;
        int weight;
        Edge(int index,int weight){
            this.index = index;
            this.weight = weight;

        }
    }

//   图
    private  static  class  Graph{

        private Vertex[] vertexes;
        private LinkedList<Edge>[] adj;
        Graph(int size){
//            初始化顶点  和 玲姐矩阵
            vertexes = new Vertex[size];
            adj = new LinkedList[size];

            for (int i = 0; i < adj.length; i++) {
                adj[i] = new LinkedList<Edge>();
            }

        }

    }
}

