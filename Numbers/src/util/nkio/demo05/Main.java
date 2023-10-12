package util.nkio.demo05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (in.hasNext()) {
            int num = in.nextInt();
            int res = 0;
            for (int i = 0; i < num; i++) {
                res += in.nextInt();
            }
            System.out.println(res);
        }
    }
}
