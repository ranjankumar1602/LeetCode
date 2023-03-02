class Solution {
    public int maximumWealth(int[][] accounts) {
        // initializing wealth with zero
        int wealth = 0;
        for(int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for(int j = 0; j < accounts[0].length; j++) {
                // taking the sum of wealth of each customers
                sum += accounts[i][j];
                if(sum > wealth) {
                    // updating the maximum wealth
                    wealth = sum;
                }
            }
        }
        return wealth;
    }
}
