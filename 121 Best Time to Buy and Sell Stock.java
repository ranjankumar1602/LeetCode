class Solution {
    public int maxProfit(int[] prices) {
        int small=Integer.MAX_VALUE;
        int profit=0;
        int today=0;
        for(int i=0;i<prices.length;i++) {
            if(prices[i]<small) {
                small=prices[i];
            }
            today=prices[i]-small;
            if(profit<today) {
                profit=today;
            }
        }
        return profit;
    }
}
