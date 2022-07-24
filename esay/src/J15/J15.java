package J15;

/**
 * @author sora
 * @create 2021-04-18 10:24
 */
public class J15 {
    public int hammingWeight(int n){
     int cnt = 0;
     while( n != 0){
         cnt += n & 1;
         n >>>= 1;
     }
     return cnt;
    }
}
