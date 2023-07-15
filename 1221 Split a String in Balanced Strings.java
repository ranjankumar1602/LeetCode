class Solution {
    public int balancedStringSplit(String s) {
        int ans = 0, sum = 0;
        for(char i : s.toCharArray()) {
            sum += (i == 'R' ? 1 : -1);
            if(sum == 0) {
                ans++;
            }
        }
        return ans;
    }
}
