package N300;

import java.util.Arrays;

/**
 * @author sora
 * @create 2021-04-09 9:05
 */
public class N300 {

    public int lengthOfLIS(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        int max = 0;
        Arrays.fill(dp,1);
        for(int i = 0;i < nums.length;i++){
            for (int j = 0;j < i;j++){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max((dp[j] + 1),dp[i]);
                }
            }
            max = Math.max(max,dp[i]);
        }
        return max;
    }




//    public static void main(String[] args) {
//        int[] arr = {10,9,2,5,3,7,101,18};
//        int[] arr2 = new int[5];
//        Arrays.fill(arr2,1);
//       for (int a : arr2){
//           System.out.println(a);
//       }
//       Arrays.sort(arr);
//       for(int a : arr){
//           System.out.println(a);
//       }
//
//    }
}
