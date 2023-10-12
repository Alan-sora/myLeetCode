package util.nkio.demo09;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String[] strings = in.nextLine().trim().split(" ");
            Arrays.sort(strings);
            for (int i = 0; i <strings.length; i++) {
                System.out.print(strings[i] + " ");
            }
            System.out.println();
            //in.nextLine();
        }
    }
}
