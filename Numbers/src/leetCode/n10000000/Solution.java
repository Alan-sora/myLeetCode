package leetCode.n10000000;

import util.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    public List<TreeNode> reTreeNode(TreeNode root) {
        if (root == null) return null;
        List<TreeNode> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        TreeNode temp = null;
        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();
            if (node.left != null) {
                stack.add(node.left);
            } else {
                if (node.right != null) {
                    stack.add(node.right);
                   // node = node.right;
                } else if (node.right == temp || node.right == null) {
                    res.add(node);
                    temp = node;
                    stack.pop();
                }
            }

        }
        return res;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(2);
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(3);
        root.left = root1;
        root.right = root2;
        List<TreeNode> res = solution.reTreeNode(root);
        for (int i = 0; i < res.size(); i++) {
            int num = res.get(i).val;
            System.out.println(num);
        }
    }
}
