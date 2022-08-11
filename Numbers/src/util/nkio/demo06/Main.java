package util.nkio.demo06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int res = 0;
            for (int i = 0; i < n; i++) {
                res += in.nextInt();
            }
            System.out.println(res);
        }
    }
}
