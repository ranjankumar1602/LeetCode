class Solution {
    public int maxProfit(int k, int[] prices) {
        if(prices.length == 0) {
            return 0;
        }
        int dp[][] = new int[k+1][prices.length];
        for(int i = 1; i <= k; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = 1; j < prices.length; j++) {
                if(dp[i-1][j-1] - prices[j-1] > max) {
                    max = dp[i - 1][j - 1] - prices[j - 1];
                }
                if(max + prices[j] > dp[i][j-1]) {
                    dp[i][j] = max + prices[j];
                }else {
                    dp[i][j] = dp[i][j-1];
                }
            }
        }
        return dp[k][prices.length-1];
        
    }
}
