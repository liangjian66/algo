public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        }
        boolean oneSame = false;
        if ((p==null&&q==null)||(p.val == q.val)){
            oneSame =  true;
        }
        boolean isSame =  oneSame&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        return  isSame;
    }
}
