package leetCode.n3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.IntFunction;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int i = 0;
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(i, map.get(j) + 1);
            }
            map.put(s.charAt(j), j);
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}
