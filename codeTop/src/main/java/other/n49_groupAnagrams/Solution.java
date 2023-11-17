package other.n49_groupAnagrams;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String keyStr = new String(chars);
            if (map.containsKey(keyStr)) {
                map.get(keyStr).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(keyStr, list);
            }
        }

        List<List<String>> res = new ArrayList<>();
        for (String key : map.keySet()) {
            res.add(map.get(key));
        }
        return res;

    }
}
