package leetCode.n98;

import util.tree.TreeNode;

public class Solution {
    public boolean isValidBST(TreeNode root) {
       return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }


    public boolean isValidBST(TreeNode root, int min, int max) {
        if (root == null) return true;
        if (root.val <= min || root.val >= max) return false;
        return isValidBST(root.left, min, root.val) && isValidBST(root, root.val, max);
    }
}
