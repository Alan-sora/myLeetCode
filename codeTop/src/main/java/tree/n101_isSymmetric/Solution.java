package tree.n101_isSymmetric;

import domain.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return check(root.left, root.right);
    }

    public boolean check(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;
        return check(left.right, right.left) && check(left.left, right.right);
    }
}
