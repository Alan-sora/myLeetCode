package util.meituan.n202109.n03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (in.hasNext()) {
            int t = in.nextInt();
            int[] data = new int[t];
            for (int i = 0; i < t; i++) {
             data[i] = in.nextInt();
            }
            int res = data[0];
            for (int i = 1; i < t; i++) {
               data[i] += Math.max(data[i - 1], 0);
               res = Math.max(res, data[i]);
            }
           /* if (data[0] > 0) {
                res += data[0];
            }*/
         //   res = Math.max(res + data[0], data[0]);
            System.out.println(res);
        }
    }
}
