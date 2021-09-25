
/*二叉搜索树 与双向链表 移动指针*/







public class TreeToDoublyList {

    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    };


    Node pre,head;
    public  Node treeToDoublyList(Node root){
        if (root == null) return null;
        dfs(root);
        head.left = pre;
        pre.right = head;
        return  head;
    }
/*中序遍历   左 根 右*/
    void  dfs(Node cur){
        if (cur == null) return;
        dfs(cur.left);
//  双向指向
        if (pre !=null) pre.right = cur;
        else  head = cur;
        cur.left = pre;
        pre = cur;

        dfs(cur.right);
    }
}
