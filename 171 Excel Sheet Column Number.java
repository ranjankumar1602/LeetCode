class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for(char ch : columnTitle.toCharArray()) {
            int temp = ch - 'A' + 1;
            ans = ans * 26 + temp;
        }
        return ans;
    }
}
