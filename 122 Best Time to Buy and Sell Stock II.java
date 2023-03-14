class Solution {
    public int maxProfit(int[] prices) {
        // base case
        if(prices.length <= 1) {
            return 0;
        }
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++) {
            maxProfit += Math.max(0, prices[i] - prices[i-1]);
        }
        return maxProfit;
    }
}
