package leetCode.n55;

public class Solution {
    public boolean canJump(int[] nums) {
        int k = 0;

        for (int i = 0; i <= k; i++) {
            int temp = nums[i] + i;
            k = Math.max(k, temp);
            if (k >= nums.length - 1) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {3,2,1,0,4};
        System.out.println(solution.canJump(a));
    }
}
