/*AVL树 核心代码*/
public class AVLTree {
    private TreeNode root;

    /*
     * 获取树的高度
     */
    private int height(TreeNode node) {
        if (node != null)
            return node.height;

        return 0;
    }

    public int height() {
        return height(root);
    }

      class  TreeNode{
        int data;
        int height;
        TreeNode left;
        TreeNode right;
          public TreeNode(int data) {
            this.data = data;
            this.height = 0;
        }
        // 获得 这颗树的平衡因子
        public int getBalance(){
            int left =  (this.left==null ? 0:this.left.height);
            int right = (this.right==null ? 0:this.right.height);

            return left-right;
        }
    }

    //左左局面旋转
    private TreeNode leftLeftRotation(TreeNode node) {
        //leftChildNode 对应示意图中的结点B
        TreeNode leftChildNode = node.left;
        node.left = leftChildNode.right;
        leftChildNode.right = node;
        //刷新结点A和结点B的高度
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        leftChildNode.height = Math.max(height(leftChildNode.left), node.height) + 1;
        //返回旋转后的父结点
        return leftChildNode;
    }
    // 右右局面 旋转

    private  TreeNode rightRightRotation(TreeNode node){
        TreeNode rightChildNode = node.right;
        node.right = rightChildNode.left;
        rightChildNode.left = node;
        // 刷新两个节点的高度
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        rightChildNode.height = Math.max(height(rightChildNode.left), node.height) + 1;
        return rightChildNode;


    }
   // 左右局面旋转
    private  TreeNode leftRightRotation(TreeNode node){
//         先对 B 做左旋
        node.left = rightRightRotation(node.left);
//         再对A 做右旋
        return  rightRightRotation(node);

    }

//  右左局面旋转
     private  TreeNode rightLeftRotation(TreeNode node){
        // 先对B
         //先做右旋
         node.right = leftLeftRotation(node.right);
         //再做左旋
         return rightRightRotation(node);
     }

    //插入结点
    public void insert(int data) {
        root = insert(root, data);
    }


    // 插入节点过程  插入节点心得 : 先找到待插入的节点(使用到递归) 然后计算平衡因子 然后根据不平衡的情况 进行旋转平衡
    //插入结点详细过程（递归）
    private TreeNode insert(TreeNode node, int data) {
        if (node == null) {
            node = new TreeNode(data);
        } else {
            if (data < node.data) {
                //新结点小于当前结点，选择当前结点的左子树插入
                node.left = insert(node.left, data);
                // 插入节点后，若AVL树失去平衡，则进行相应的调节。
                if (node.getBalance() == 2) {
                    if (data < node.left.data) {
                        node = leftLeftRotation(node);
                    } else {
                        node = leftRightRotation(node);
                    }
                }
            } else if (data > node.data)  {
                //新结点大于当前结点，选择当前结点的右子树插入
                node.right = insert(node.right, data);
                // 插入节点后，若AVL树失去平衡，则进行相应的调节。
                if (node.getBalance() == -2) {
                    if (data > node.right.data) {
                        node = rightRightRotation(node);
                    } else {
                        node = rightLeftRotation(node);
                    }
                }
            } else {
                System.out.println("AVL树中已有重复的结点！");
            }
        }
        //刷新结点的高度
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }
//  中序遍历  递归 一定写终止条件
    public static void inOrderTraversal(TreeNode node){
        if(node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data+" ");
            inOrderTraversal(node.right);
        }
    }

    public static void main(String[] args) {

        AVLTree tree = new AVLTree();
        int input[]= {5,3,7,2,4,6,9,1};
        for(int i=0; i<input.length; i++) {
            tree.insert(input[i]);
        }

        System.out.println("中序遍历: ");
        inOrderTraversal(tree.root);
        System.out.println("====");

    }

}
