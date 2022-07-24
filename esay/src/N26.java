/**
 * @author sora
 * @create 2021-03-15 22:25
 */
public class N26 {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length == 0) return 0;
        int p = 0;
        int q = 1;
        while (q < nums.length){
            if(nums[p] != nums[q]){
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return  p+1;
   
    }

    public static void main(String[] args) {
        int[] nums =  {1,1,2};
        int a = 0;
        N26 n26 = new N26();
        System.out.println(n26.removeDuplicates(nums));
    }
}
