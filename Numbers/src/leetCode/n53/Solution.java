package leetCode.n53;

public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length < 0) return 0;
        if (nums.length == 1) return nums[0];
      int res = 0;
        int sum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (sum  < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            res = Math.max(res, sum);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution.maxSubArray(a));
    }
}
