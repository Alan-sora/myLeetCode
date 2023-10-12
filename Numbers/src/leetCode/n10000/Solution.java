package leetCode.n10000;

public class Solution {
    public int getMaxConsecutiveOnes (int[] arr, int n) {
        if (arr == null || arr.length < 0) return 0;
        // write code here
        int[][] dp = new int[arr.length][2];
        if (arr[1] == 0) dp[0][0] = 1;
        else dp[0][1] = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                dp[i][0] = dp[i - 1][0] + 1;
            } else {
                dp[i][1] = dp[i - 1][1] + 1;
            }
        }
        return Math.max(dp[arr.length - 1][0], dp[arr.length - 1][1]);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(solution.getMaxConsecutiveOnes(a,1));
    }
}
