package N10;

/**
 * @author sora
 * @create 2021-04-14 9:28
 */
public class N10I {
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n;i++){
            dp[i] = dp[i - 1] + dp[i - 2];
            dp[i] %= 1000000007;
        }
        return dp[n];


    }

    public static void main(String[] args) {
        N10I n10I =new N10I();
        System.out.println(n10I.fib(5));
    }
}
