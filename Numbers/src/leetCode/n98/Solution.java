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

    private static class TreeNode {
        public   int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val,TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;





            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        Solution solution = new Solution();
        solution.isValidBST(root);
    }

}
