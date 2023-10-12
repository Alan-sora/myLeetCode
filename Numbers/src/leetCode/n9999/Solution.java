package leetCode.n9999;

public class Solution {

    public int[][] count (String str) {
        // write code here
        char[] chars = str.toCharArray();
        int[] temp = new int[10];
        int[][] res = new int[9][2];
        for (int i = 0; i < chars.length; i++) {
            int num = nums(chars[i]);
            int pos = num(chars[i]);
            temp[pos] += num;
        }
        int k = 0;
        for (int i = 1; i < 9; i++) {
         if (temp[i] != 0) {
             res[k][0] = i;
             res[k][1] = temp[i];
             k++;
         }
        }

        int[][] res1 = new int[k][2];
        for (int i = 0; i < k; i++) {
            res1[i][0] = res[i][0];
            res1[i][1] = res[i][1];

        }
        return res1;
    }


    public int nums(Character c) {
        if (c == '@') return 1;
        if (c == '!') return 2;
        if (c == '.') return 3;
        if (c == '/') return 4;
        if (c == 'a') return 1;
        if (c == 'b') return 2;
        if (c == 'c') return 3;
        if (c == 'd') return 1;
        if (c == 'e') return 2;
        if (c == 'f') return 3;
        if (c == 'g') return 1;
        if (c == 'h') return 2;
        if (c == 'i') return 3;
        if (c == 'j') return 1;
        if (c == 'k') return 2;
        if (c == 'l') return 3;
        if (c == 'm') return 1;
        if (c == 'n') return 2;
        if (c == 'o') return 3;
        if (c == 'p') return 1;
        if (c == 'q') return 2;
        if (c == 'r') return 3;
        if (c == 's') return 4;
        if (c == 't') return 1;
        if (c == 'u') return 2;
        if (c == 'v') return 3;
        if (c == 'w') return 1;
        if (c == 'x') return 2;
        if (c == 'y') return 3;
         return 4;
    }

    public int num(Character c) {
        if (c == '@') return 1;
        if (c == '!') return 1;
        if (c == '.') return 1;
        if (c == '/') return 1;
        if (c == 'a') return 2;
        if (c == 'b') return 2;
        if (c == 'c') return 2;
        if (c == 'd') return 3;
        if (c == 'e') return 3;
        if (c == 'f') return 3;
        if (c == 'g') return 4;
        if (c == 'h') return 4;
        if (c == 'i') return 4;
        if (c == 'j') return 5;
        if (c == 'k') return 5;
        if (c == 'l') return 5;
        if (c == 'm') return 6;
        if (c == 'n') return 6;
        if (c == 'o') return 6;
        if (c == 'p') return 7;
        if (c == 'q') return 7;
        if (c == 'r') return 7;
        if (c == 's') return 7;
        if (c == 't') return 8;
        if (c == 'u') return 8;
        if (c == 'v') return 8;
        if (c == 'w') return 9;
        if (c == 'x') return 9;
        if (c == 'y') return 9;
        return 9;
    }
}
