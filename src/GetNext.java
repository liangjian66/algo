
/*二叉树的下一个节点：GetNext 思路： 两种1. 有右子树然后查找左子树左子树 2. 无右子树 ，向上查找 */


public class GetNext {

    public  class  TreeLinkNode{
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;  //指向父节点的指针
        TreeLinkNode(int val){
            this.val = val;
        }
    }


    public  TreeLinkNode getNext(TreeLinkNode pNode){
        if (pNode.right!=null){
            TreeLinkNode rightNode = pNode.right;
            while (rightNode.left!=null){
                rightNode = rightNode.left;
            }
            return  rightNode;
        }
        else {
//            不断向上 查找父节点 当父节点是父父节点的左节点时 返回父父节点
            while (pNode.next!=null)
            {
                TreeLinkNode parent = pNode.next;
                if (parent.left == pNode)
                    return  parent;
                pNode = pNode.next;
            }
        }
        return null;
    }
}
