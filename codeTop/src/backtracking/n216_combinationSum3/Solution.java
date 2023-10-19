package backtracking.n216_combinationSum3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(k, n, 1, 0);
        return res;
    }

    public void backtracking(int k, int n, int i, int sum) {
        if (sum == n && path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int j = i; j <= 9; j++) {
            sum += j;
            path.add(j);
            backtracking(k, n, j + 1, sum);
            sum -= j;
            path.removeLast();
        }
    }
}
