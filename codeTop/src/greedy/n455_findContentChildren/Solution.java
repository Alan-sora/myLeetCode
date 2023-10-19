package greedy.n455_findContentChildren;

import java.util.Arrays;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (s[j] >= g[i]) {
                    res++;
                    s[j] = 0;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {1,1};
        Solution s = new Solution();
        System.out.println(s.findContentChildren(a, b));
    }
}
