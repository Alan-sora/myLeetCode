package race2023.n02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int participantCount = scanner.nextInt();
        int pathCount = scanner.nextInt();
        int[] heights = new int[participantCount];
        for (int i = 0; i < participantCount; i++) {
            heights[i] = scanner.nextInt();
        }
        List<int[]> paths = new ArrayList<>();
        for (int i = 0; i < pathCount; i++) {
            int[] path = new int[2];
            path[0] = scanner.nextInt();
            path[1] = scanner.nextInt();
            paths.add(path);
        }
        int maxPassCount = calculateMaxPassCount(participantCount, heights, paths);
        System.out.println(maxPassCount);
    }

    public static int calculateMaxPassCount(int participantCount, int[] heights, List<int[]> paths) {
        int maxPassCount = 0;
        boolean[][] canPass = new boolean[participantCount][participantCount];

        for (int[] path : paths) {
            int person1 = path[0] - 1;
            int person2 = path[1] - 1;
            if (Math.abs(heights[person1] - heights[person2]) <= 10) {
                canPass[person1][person2] = true;
                canPass[person2][person1] = true;
            }
        }

        boolean[] visited = new boolean[participantCount];
        for (int i = 0; i < participantCount; i++) {
            if (!visited[i]) {
                int passCount = dfs(i, participantCount, canPass, visited);
                maxPassCount = Math.max(maxPassCount, passCount);
            }
        }

        return maxPassCount;
    }

    private static int dfs(int person, int participantCount, boolean[][] canPass, boolean[] visited) {
        visited[person] = true;
        int passCount = 1;  // 包括自己

        for (int i = 0; i < participantCount; i++) {
            if (canPass[person][i] && !visited[i]) {
                passCount = Math.max(passCount, dfs(i, participantCount, canPass, visited) + 1);
            }
        }

        visited[person] = false;  // 恢复visited数组状态

        return passCount;
    }
}