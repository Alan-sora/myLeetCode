package J16;

/**
 * @author sora
 * @create 2021-04-18 10:29
 */
public class J16 {
    public double myPow(double x, int n){
        if(n == 0) {
            return 1;
        }else if(n < 0){
            return 1 /( x * myPow(x,-n-1));
        }else if(n % 2 ==0){
            return myPow(x * x ,n /2);
        }else {
            return x * myPow(x,n - 1);
        }

    }

    public static void main(String[] args) {
        J16 j16 = new J16();
        System.out.println(j16.myPow(2.00000,10));
    }
}
