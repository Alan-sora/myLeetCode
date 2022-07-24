package leetCode.n63ii;

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length < 0) return 0;
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i = 1; i < obstacleGrid.length; i++) {
            if (obstacleGrid[i][0] == 1) {
                dp[i][0] = -1;
            } else {
                if (dp[i - 1][0] < 0) {
                    dp[i][0] = -1;
                } else {
                    dp[i][0] = 1;
                }
            }
        }

        for (int j = 1; j < obstacleGrid[0].length; j++) {
            if (obstacleGrid[0][j] == 1) {
                dp[j][0] = -1;
            } else {
                if (dp[0][j - 1] < 0) {
                    dp[0][j] = -1;
                } else {
                    dp[0][j] = 1;
                }
            }
        }

        for (int i = 1; i < obstacleGrid.length; i++) {
            for (int j = 1; j < obstacleGrid[0].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = -1;
                } else {
                    dp[i][j] = (dp[i - 1][j] < 0 ? 0 : dp[i - 1][j]) + (dp[i][j - 1] < 0 ? 0 : dp[i][j - 1]);
                }
            }
        }
        return dp[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] a = {{0,1}, {0,0}};

        System.out.println(solution.uniquePathsWithObstacles(a));
    }
}
