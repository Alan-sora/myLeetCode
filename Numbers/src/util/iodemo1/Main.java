package util.iodemo1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int length = in.nextInt();
            int[] a = new int[length];
            int[] b = new int[length];
            for (int i = 0; i < length; i++) {
                a[i] = in.nextInt();
                System.out.print(a[i] + " ");
            }
            for (int i = 0; i < length; i++) {
                b[i] = in.nextInt();
                System.out.print(b[i] + " ");
            }
        }
    }

}
