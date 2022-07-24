/**
 * @author sora
 * @create 2021-03-16 21:32
 */
public class N27 {
    public int removeElement(int[] nums, int val) {
        if(nums==null||nums.length==0) return 0;
        int p = 0;
        int q = nums.length + 1;
        while(q != p ){
            while(q != p && nums[q]!=val) q--;
            nums[p] = nums[q];
            while (q != p && nums[p] != val ) p++;
            nums[q] = nums[p];

        }
          return p +1;
        }
    }

