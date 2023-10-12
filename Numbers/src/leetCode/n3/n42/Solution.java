package leetCode.n3.n42;

public class Solution {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int res = 0;
        for (int i = 1; i < height.length; i++) {
            left[i] = height[i];
            for (int j = i - 1; j > 0; j--) {
                left[i] = Math.max(left[i], height[j]);
            }
        }

        for (int i = 0; i < height.length - 1; i++) {
            right[i] = height[i];
            for (int j = i + 1; j < height.length; j++) {
                right[i] = Math.max(right[i],height[j]);
            }
        }

        for (int i = 1; i < height.length - 1; i++) {
            if (height[i] < Math.min(left[i], right[i])) {
                res += Math.min(left[i], right[i]) - height[i];
            }
        }
        return res;
    }
}
