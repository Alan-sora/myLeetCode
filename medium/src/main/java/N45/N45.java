package N45;

import java.util.Arrays;

/**
 * @author sora
 * @create 2021-04-13 11:49
 */
public class N45 {
    public int jump(int[] nums){
        int cnt = 0;
        int end = 0;
        int maxPostion = 0;
        for(int i = 0; i < nums.length - 1; i++){
            maxPostion = Math.max(maxPostion,i + nums[i]);
            if(i == end){
                end = maxPostion;
                cnt++;
            }
        }
        return cnt;
    }
}
