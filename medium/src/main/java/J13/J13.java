package J13;

/**
 * @author sora
 * @create 2021-04-18 9:15
 */
public class J13 {
    public int movingCount(int m, int n, int k){
        boolean[][] vis = new boolean[m][n];
        return dfs(0,0,m,n,k,vis);
    }

    public int dfs(int i,int j,int m,int n,int k,boolean[][] vis){
        if(i >= m || j >= n || k < getSum(i) + getSum(j) || vis[i][j]) return 0;
        vis[i][j] = true;
        return 1 + dfs(i+1,j,m,n,k,vis) + dfs(i,j+1,m,n,k,vis);
    }

    public int getSum(int num){
        int a = num % 10;
        int b = num / 10;
        while(b > 0){
            a += b % 10;
            b /= 10;
        }
        return a;
    }


    public static void main(String[] args) {
        J13 j13 = new J13();
        System.out.println(j13.movingCount(2,3,1));
    }
}
