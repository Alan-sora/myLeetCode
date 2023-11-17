package backtracking.n39_combinationSum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {




    public  void printList(List<List<Integer>> res) {
        for (List<Integer> innerList : res) {
            for (Integer value : innerList) {
                System.out.print(value + " ");
            }
            System.out.println(); // 换行
        }
    }


}
