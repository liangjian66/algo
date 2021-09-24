
/*二叉搜索树的后序遍历序列：VerifySquenceOfBST   先画图再写代码 抽象能力 ， 先画出具体二叉树 比如 5 7 6 9 11 10 8 */
public class VerifySquenceOfBST {
       public  boolean verifyPostorder(int[] postOrder){
              if (postOrder == null){
                  return false;
              }
              return recur(postOrder,0,postOrder.length-1);
       }


//       递归函数  递归左子树 和右子树   拆分子问题
      boolean recur(int[] postOrder,int i,int j){
           // 终止条件
          if (i>=j){
              return  true;
          }
//          定义一个P 指针 跟根节点对于 小于跟节点 ++  j 代表跟节点
          int p = i ;
          while (postOrder[p]<postOrder[j]) p++;
          int m = p;
          while (postOrder[p]>postOrder[j]) p++;
          return  p==j && recur(postOrder,i,m-1)&&recur(postOrder,m,j-1);

      }

}
