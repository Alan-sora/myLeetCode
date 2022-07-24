package J27;

import javax.swing.tree.TreeNode;

/**
 * @author sora
 * @create 2021-04-23 14:19
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode (int x){ val = x;}


    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) return null;
        TreeNode tmp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmp);
        return root;


    }
}
