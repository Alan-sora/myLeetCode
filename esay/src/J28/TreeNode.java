package J28;

/**
 * @author sora
 * @create 2021-04-23 14:36
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode (int x) { val = x;}

    public boolean isSymmetric(TreeNode root){
        return root == null ? true : recur(root.left,root.right);
    }

    boolean recur(TreeNode left,TreeNode right){
        if(left == null && right == null) return  true;
        if(left == null || right == null || left.val != right.val) return false;
        return  recur(left.left,right.right) && recur(left.right,right.left);
    }
}
