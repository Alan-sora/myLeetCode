package J17;

/**
 * @author sora
 * @create 2021-04-19 9:05
 */
public class J17 {
    public int[] printNumbers(int n){
        int end = (int)Math.pow(10,n) - 1;
        int[] res = new int[end];
        for(int i = 0;i < end ;i++){
            res[i] = i + 1;
        }
        return res;
    }
}
