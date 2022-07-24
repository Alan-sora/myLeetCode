package leetCode.n128;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int res = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int count = 1;
                int n = num + 1;
                while (set.contains(n)) {
                    count++;
                    n += 1;
                }
                res = Math.max(count, res);
            }
        }
        return res;
    }
}
