package J03;

import java.util.Arrays;

/**
 * @author sora
 * @create 2021-04-12 21:36
 */
public class J03 {
    public int findRepeatNumber(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == nums[i + 1]) return nums[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        J03 j03 = new J03();
        int[] a = new int[]{2, 3, 1, 0, 2, 5, 3};
        System.out.println(j03.findRepeatNumber(a));
    }

}
