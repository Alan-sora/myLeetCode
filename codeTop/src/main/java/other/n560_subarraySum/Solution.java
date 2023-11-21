package other.n560_subarraySum;

public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; ++start) {
            int sum = 0;
            for (int end = start; end >= 0; --end) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,-1,0};
        System.out.println(s.subarraySum(nums , 0));
    }
}
