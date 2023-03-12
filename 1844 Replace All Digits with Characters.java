class Solution {
    public String replaceDigits(String s) {
        char ans[] = s.toCharArray();
        for(int i = 1; i < ans.length; i+=2) {
            ans[i] += (char)ans[i-1] - '0';
        }
        return String.valueOf(ans);
    }
}
