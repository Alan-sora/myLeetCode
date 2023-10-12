package util.nkio.demo07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String[] strings = in.nextLine().trim().split(" ");
            int res = 0;
            for (int i = 0; i < strings.length; i++) {
                int a = Integer.parseInt(strings[i]);
                res += a;
            }
            System.out.println(res);
        }
    }
}
