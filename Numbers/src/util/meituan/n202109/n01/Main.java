package util.meituan.n202109.n01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int[] num = new int[m];
            for (int i = 0 ; i < m; i++) {
                num[i] = in.nextInt();
            }
            int min = Math.min(a, b);
            int max = Math.max(a, b);
            Arrays.sort(num);
            if (min != 1 && main.find(num, 1) || max < num[m - 1]) {
                System.out.println("NO");
            } else if (n - m >= 2) {
                    System.out.println("YES");

            } else {
                if (main.find(num, a) && main.find(num, b)) {
                    System.out.println("YES");
                } else if ((main.find(num,a) || main.find(num, b)) && n - m >= 1){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

        }
    }

    public boolean find(int[] num, int target) {
        if (num.length < 0 || num == null) return false;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                return true;
            }
        }
        return false;
    }


}
