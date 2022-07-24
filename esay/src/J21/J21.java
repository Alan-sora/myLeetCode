package J21;

import J05.J05;

/**
 * @author sora
 * @create 2021-04-23 8:55
 */
public class J21 {
    public int[] exchange(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[left] % 2 != 0) {
                left++;
            }
            while (left < right && nums[right] % 2 == 0) {
                right--;
            }
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;
    }


    public static void main(String[] args) {
        J21 j21 = new J21();
        int[] a = new int[]{1,2,3,4};
        j21.exchange(a);
        System.out.println(a.toString());
    }
}
