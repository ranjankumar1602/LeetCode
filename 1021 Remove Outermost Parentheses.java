class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int count = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '(' && count++ > 0) {
                ans += ch;
            }
            if(ch == ')' && count-- > 1) {
                ans += ch;
            }
        }
        return ans;
    }
}
