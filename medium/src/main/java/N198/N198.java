package N198;

/**
 * @author sora
 * @create 2021-04-09 10:02
 */
public class N198 {
    public int rob(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        int[] dp = new int[nums.length + 1];
        dp[1] = nums[0];
        for(int i = 2; i <= nums.length;i++){
            dp[i] = Math.max(dp[i - 1],(dp[i - 2] +nums[i - 1]));
        }
        return dp[nums.length];
    }


}
