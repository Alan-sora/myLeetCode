/**
 * @author sora
 * @create 2021-04-07 21:28
 */
public class N11 {
    public int maxArea(int[] height){
        int i = 0;
        int j = height.length - 1;
        int are = 0;
        int ares = 0;
        int res = 0;
        while(i < j){
            ares = (j - i) *(Math.min(height[i],height[j]));
            res = Math.max(res,ares);
            if(height[i] < height[j]){
                i++;
            }else {
                j--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        N11 n11 = new N11();
        int[] a = new int[]{1,8,6,2,5,4,8,3,7};
        int i = n11.maxArea(a);
        System.out.println(i);
    }
}
