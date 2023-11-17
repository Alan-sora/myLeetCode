package other.n11_maxArea;

public class Solution {

    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int res = Math.min(height[i], height[j]) * (j - i);
        while (i < j) {
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
            res = Math.max(res, Math.min(height[i], height[j]) * (j - i));
        }
        return res;
    }

   /* public int maxArea(int[] height) {
        int res = 0;

        for (int i = 0; i < height.length - 1; i++) {
            for (int j = height.length - 1; j > i; j--) {
                res = Math.max(res, Math.min(height[i], height[j]) * (j - i));
            }
        }
        return res;
    }*/
}
