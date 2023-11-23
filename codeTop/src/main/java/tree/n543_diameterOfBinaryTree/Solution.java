package tree.n543_diameterOfBinaryTree;

import domain.TreeNode;

public class Solution {
    int res = 1;

    public int diameterOfBinaryTree(TreeNode root) {
        deep(root);
        return res - 1;
    }

    public int deep(TreeNode root) {
        if (root == null) return 0;
        int l = deep(root.left);
        int r = deep(root.right);
        res = Math.max(l + r + 1, res);
        return Math.max(l, r) + 1;
    }

}
