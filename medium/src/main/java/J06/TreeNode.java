package J06;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sora
 * @create 2021-04-13 10:55
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){ val = x;}
    class Solution{

        private Map<Integer,Integer> map;

        public TreeNode buildTree(int[] preorder, int[] inorder){
            int n = preorder.length;
            map = new HashMap<Integer, Integer>();
            for(int i = 0; i < n; i++){
                map.put(inorder[i],i);
            }
            return MyBuildTree(preorder,inorder,0,n-1,0,n-1);
        }

        public TreeNode  MyBuildTree(int[] preoeder,int[] inorder,int preorder_left,int preoeder_right,
                                     int inorder_left,int inorder_right){
            if(preorder_left > preoeder_right) return null;
            int preorder_root = preorder_left;
            int inorder_root = map.get(preoeder[preorder_root]);

            int size_left = inorder_root - inorder_left;
            TreeNode root = new TreeNode(preoeder[preorder_root]);


            root.left = MyBuildTree(preoeder,inorder,preorder_left + 1,preorder_left + size_left,inorder_left,inorder_root - 1);

            root.right = MyBuildTree(preoeder,inorder,preorder_left + size_left +1,preoeder_right,inorder_root + 1,inorder_right);
            return  root;
        }


    }
}
