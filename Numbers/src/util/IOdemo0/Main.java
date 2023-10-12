package util.IOdemo0;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //int[] num = new int[0];
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] num  = new int[n];
            for (int i = 0; i < n; i++) {
                num[i] = in.nextInt();
                System.out.println(num[i] + " ");
            }

        }
        in.close();

    }
}
