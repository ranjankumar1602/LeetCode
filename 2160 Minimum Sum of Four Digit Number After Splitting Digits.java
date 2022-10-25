class Solution {
    public int minimumSum(int num) {
        int dp[] = new int[4];
        int i = 0;
        while(num > 0) {
            dp[i] = num % 10;
            num = num / 10;
            i++;
        }
        Arrays.sort(dp);
        int sum1 = (dp[0] * 10) + dp[2];
        int sum2 = (dp[1] * 10) + dp[3];
        return sum1 + sum2;
    }
}
