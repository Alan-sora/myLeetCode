package backtracking.n77_combine;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
            backtracking(n, k, 1);

        return res;
    }

    public void backtracking(int n, int k, int i) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
        }

        for (int j = i; j <= n; j++) {
            path.add(j);
            backtracking(n, k, j + 1);
            path.removeLast();
        }
    }
}
