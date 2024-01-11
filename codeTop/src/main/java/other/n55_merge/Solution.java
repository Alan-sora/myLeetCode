package other.n55_merge;

import java.util.*;

public class Solution {
    public int[][] merge(int[][] intervals){

        if (intervals.length == 0) {
            return new int[0][2];
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (i < intervals.length - 1) {
                int a = intervals[i][0];
                int b = intervals[i][1];

                int c = intervals[i + 1][0];
                int d = intervals[i + 1][1];

                if (b < c) {
                    list.add(a);
                    list.add(b);
                } else if (b == c) {
                    list.add(a);
                    list.add(d);
                    i++;
                } else {
                    for (int j = i + 1; j < intervals.length; j++) {
                        if (intervals[j][1] > b) {
                            list.add(a);
                            list.add(intervals[j][1]);
                            i = j;
                            break;
                        }
                    }
                }

            } else {
                list.add(intervals[i][0]);
                list.add(intervals[i][1]);
            }



        }

        int[][] res = new int[list.size() / 2][2];
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            res[j][0] = list.get(i);
            i++;
            res[j][1] = list.get(i);
            j++;
        }
        return res;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] n = {{1,4},{0,1}};
        int[][] res = s.merge(n);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i][0] + ", ");
            System.out.println(res[i][1]);
        }
    }
}
