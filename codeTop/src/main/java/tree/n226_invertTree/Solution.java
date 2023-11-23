package tree.n226_invertTree;

import domain.TreeNode;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
       TreeNode temp = invertTree(root.left);
       root.left = invertTree(root.right);
       root.right = temp;
       return root;
    }
}
