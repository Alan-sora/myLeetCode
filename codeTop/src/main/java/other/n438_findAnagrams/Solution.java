package other.n438_findAnagrams;

import domain.ToolUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        char[] p_c = p.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c : p_c) {
            set.add(c);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            int temp = 0;
            for (int j = i; j < i + p.length(); j++) {
                if (set.contains(s.charAt(j))) {
                    temp++;
                } else {
                    break;
                }
                if (temp == p.length()) {
                    res.add(i);
                }

            }
        }
        return res;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "cbaebabacd";
        String p = "abc";
        List<Integer> res = s.findAnagrams(str, p);
        ToolUtils toolUtils = new ToolUtils();
        toolUtils.logList(res);
    }
}
