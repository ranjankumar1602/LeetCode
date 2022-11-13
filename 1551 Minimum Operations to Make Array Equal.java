class Solution {
    public int minOperations(int n) {
        int[] dp = new int[n];
        int ans = 0, mid = (n - 1) / 2;
        for(int i = 0; i < n; i++) {
            dp[i] = (2 * i) + 1;
            if(dp[i] != n && i <= mid) {
                ans += (n - dp[i]);
            }
        }
        return ans;
    }
}
