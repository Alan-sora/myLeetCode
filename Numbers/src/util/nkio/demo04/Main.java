package util.nkio.demo04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) break;
            int res = 0;
            for (int i = 0; i < n; i++) {
                res += in.nextInt();
            }
            System.out.println(res);
        }
    }
}
