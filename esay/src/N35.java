/**
 * @author sora
 * @create 2021-03-27 21:45
 */
public class N35 {

        public int searchInsert(int[] nums, int target) {
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == target){
                    return i;
                }
                if(nums[i] > target) {
                    return i;
                }

            }
           int i = nums.length;
            return i ;

    }


    public static void main(String[] args) {
        N35 n35 = new N35();
        int[] n = {1,3,5,6};
        int a = n35.searchInsert(n,5);
        System.out.println(a);
    }
}
