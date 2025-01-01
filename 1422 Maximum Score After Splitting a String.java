class Solution {
    public int maxScore(String s) {
        int zero = 0;
        int one = 0;
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == '1') {
                one++;
            }else {
                zero++;
            }
            ans = Math.max(ans, zero - one);
        }
        if(s.charAt(s.length() - 1) == '1') {
            one++;
        }
        return ans + one;
    }
}
