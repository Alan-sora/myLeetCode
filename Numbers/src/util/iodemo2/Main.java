package util.iodemo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int num = in.nextInt();  // 病毒个数
            int count = in.nextInt(); // 分裂次数
            int dead = in.nextInt(); // 致命个数
            int[] deadNum = new int[dead]; // 致命病毒数组
            for (int i = 0; i < dead; i++) {
                deadNum[i] = in.nextInt();
            }

            List<List<Integer>> index = new ArrayList<>();
            in.nextLine();
            while (in.hasNextLine())  {
                String str = in.nextLine();
                String[] strs = str.trim().split(" ");
                List<Integer> temp = new ArrayList<>();
                for (int i = 0; i < strs.length; i++) {
                    temp.add(Integer.parseInt(strs[i]));
                }
                index.add(new ArrayList<>(temp));
            }
        }
    }
}
