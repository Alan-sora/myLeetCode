package tree.n94_inorderTraversal;

import domain.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        recur(root);
        return res;
    }

    public void recur(TreeNode node) {
        if (node == null) return;
        recur(node.left);
        res.add(node.val);
        recur(node.right);
    }
}
