package leetCode.n674;

public class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length < 0) return 0;
        int res = 0;
        int temp = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                temp++;
            } else {
                temp = 1;
            }
            res = Math.max(res, temp);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1,2,3,5,4,7};
        System.out.println(solution.findLengthOfLCIS(a));
    }
}
