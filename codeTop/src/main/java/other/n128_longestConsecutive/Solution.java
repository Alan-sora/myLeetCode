package other.n128_longestConsecutive;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int res = 0;
        for (Integer num : set) {
            if (!set.contains(num - 1)) {
                int tempNum = num;
                int tempLength = 1;

                while (set.contains(tempNum + 1)) {
                    tempNum ++;
                    tempLength++;
                }
                res = Math.max(res, tempLength);
            }
        }
        return  res;
    }
}
