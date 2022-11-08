class Solution {
    public int commonFactors(int a, int b) {
        int ans = Math.min(a, b);
        int count = 0;
        for(int i = 1; i <= ans; i++) {
            if(a % i == 0 && b % i == 0) {
                count++;
            }
        }
        return count;
    }
}
