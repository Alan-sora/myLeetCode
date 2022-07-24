package leetCode.n300;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length < 0) return 0;
        if (nums.length < 2) return 1;

        int[] dp = new int[nums.length];
       for (int i = 0; i < nums.length; i++) {
           dp[i] = 1;
       }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                dp[i] = Math.max(dp[i - 1] + 1, dp[i]);
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {10,9,2,5,3,7,101,19};
        System.out.println(solution.lengthOfLIS(a));
    }
}
