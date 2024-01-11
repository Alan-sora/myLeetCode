package DP.n2645_addMinimum;

public class Solution {
    public int addMinimum(String word) {
        if (word.length() == 1) return 2;
        int[] dp = new int[word.length()];
        dp[1] = 2;
        for (int i = 2; i < word.length(); i++) {
            dp[i] = dp[i - 1] + 2;
            if (word.charAt(i) > word.charAt(i - 1)) {
                dp[i] = dp[i - 1] - 1;
            }
        }
        return dp[word.length() - 1];

    }
}
