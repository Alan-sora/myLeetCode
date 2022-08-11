package util.nkio.demo01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
            int c = in.nextInt();
            int d = in.nextInt();
            System.out.println(c + d);
        }
        in.close();
    }
}
