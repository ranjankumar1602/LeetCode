class Solution {
    public int numTrees(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                dp[i] += dp[j-1] * dp[i-j];
            }
        }
        return dp[n];
    }
    
    /*
    
    public int numTrees(int n) {
        int dp[] = new int[n+1];
        for(int i = 0; i <=n; i++) {
            dp[i] = -1;
        }
        return numTrees(n,dp);
    }
    private int numTrees(int n, int dp[]) {
        if(n<=1) {
            return 1;
        }
        if(dp[n] != -1) {
            return dp[n];
        }
        int result = 0;
        for(int j = 1; j <= n; j++) {
            result += numTrees(j-1, dp) * numTrees(n-j, dp);
        }
        return dp[n] = result;
    }
    */
}
