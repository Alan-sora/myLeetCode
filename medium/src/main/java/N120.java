import java.util.List;

/**
 * @author sora
 * @create 2021-04-08 21:52
 */
public class N120 {
    public int minimumTotal(List<List<Integer>> triangle){
        int n = triangle.size();
        int[][] dp = new int[n][n];
        List<Integer> lastRow = triangle.get(n - 1);
        for(int i = 0;i < n;i++){
            dp[n - 1][i] = lastRow.get(i);
        }
        for(int i = n - 2;i >= 0;i--){
            List<Integer> row = triangle.get(i);
            for(int j = 0;j < i + 1;j++){
                dp[i][j] = Math.min(dp[i + 1][j],dp[i + 1][j + 1]) + row.get(j);
            }
        }
        return dp[0][0];
    }
}
