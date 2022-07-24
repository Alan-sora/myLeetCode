package N213;

import java.util.Arrays;

/**
 * @author sora
 * @create 2021-04-09 10:19
 */
public class N213 {
    public int rob(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        return Math.max(rob1(Arrays.copyOfRange(nums,0,nums.length - 1)),rob1(Arrays.copyOfRange(nums,1,nums.length)));
    }


    public int rob1(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        int[] dp = new int[nums.length + 1];
        dp[1] = nums[0];
        for(int i = 2; i <= nums.length;i++){
            dp[i] = Math.max(dp[i - 1],(dp[i - 2] +nums[i - 1]));
        }
        return dp[nums.length];
    }

}
