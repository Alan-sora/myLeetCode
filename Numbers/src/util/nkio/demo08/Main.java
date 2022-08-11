package util.nkio.demo08;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            System.out.println(n);
            in.nextLine();
            String[] strings = in.nextLine().trim().split(" ");
            /*for (int i = 0; i < n; i++) {
                System.out.print(strings[i]);
            }*/
            Arrays.sort(strings);
            for (int i = 0; i < strings.length; i++) {
                if (i == strings.length - 1) {
                    System.out.print(strings[i]);
                } else {
                    System.out.print(strings[i] + " ");
                }
            }
        }
    }
}
