package backtracking.n46_permute;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] flag = new boolean[nums.length];
        for (boolean a : flag) {
            a = false;
        }
        backtrack(nums,  flag);
        return res;
    }

    public void backtrack(int[] nums, boolean[] flag) {
        if (path.size() == nums.length ) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int  i = 0; i < nums.length; i++) {
            if (flag[i]) continue;
            flag[i] = true;
            path.add(nums[i]);
            backtrack(nums, flag);
            flag[i] = false;
            path.removeLast();
        }
        return;
    }
}
