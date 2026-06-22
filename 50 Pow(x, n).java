class Solution {
    public double myPow(double x, int n) {
        
        if(n==0 || x == 1) return 1.0;
        if(x == 0) return 0.0;
        if(x == -1 && n % 2 == 0) return 1.0;
        if(x == -1 && n % 2 != 0) return -1.0;
        
        long binPow = n;

        if(n < 0) {
            x = 1/x;
            binPow = -binPow;
        }

        double ans = 1;

        while(binPow > 0) {
            if(binPow % 2 == 1) {
                ans *= x;
            }
            x *= x;
            binPow /= 2;
        }
        return ans;
    }
}
