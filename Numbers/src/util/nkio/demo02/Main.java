package util.nkio.demo02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                System.out.println(a + b);
            }
        }
    }
}
