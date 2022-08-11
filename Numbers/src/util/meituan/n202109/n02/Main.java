package util.meituan.n202109.n02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = in.nextInt();
        }
        int num = 0;
        Arrays.sort(score);
        for (int i = n - 1; i >= n - x; i-- ) {
            if (score[i] >= score[n - x]  && score[i] > 0) num++;
        }
        System.out.println(num);
    }
}
