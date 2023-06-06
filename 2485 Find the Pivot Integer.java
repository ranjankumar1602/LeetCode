class Solution {
    public int pivotInteger(int n) {
        int lsum = 0;
        int sum = n * (n + 1) / 2;
        for(int i = 1; i <= n; i++) {
            lsum += i;
            int rsum = sum - lsum + i;
            if(lsum == rsum) {
                return i;
            }
        }
        return -1;
    }
}
