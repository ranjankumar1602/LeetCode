class Solution {
    private int tribonacci(int n, int[] ans) {
        if(n == 0 || n == 1) {
            ans[n] = n;
            return ans[n];
        }
        if(n == 2) {
            ans[n] = 1;
            return ans[n];
        }
        if(ans[n] != -1) {
            return ans[n];
        }
        ans[n] = tribonacci(n - 1,ans) + tribonacci(n - 2,ans) + tribonacci(n - 3,ans);
        return ans[n];
    }
    
    public int tribonacci(int n) {
        int ans[] = new int[n + 1];
        for(int i = 0; i <= n; i++) {
            ans[i] = -1;
        }
        return tribonacci(n, ans);
    }
}
