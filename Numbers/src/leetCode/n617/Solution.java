package leetCode.n617;

import util.tree.TreeNode;

public class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;
        TreeNode node = new TreeNode(root1.val + root2.val);
        node.left = mergeTrees(root1.left, root1.left);
        node.right = mergeTrees(root2.right, root2.right);
        return node;
    }
}
