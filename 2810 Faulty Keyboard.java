class Solution {
    public String finalString(String s) {
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()) {
            if(ch == 'i') {
                ans.reverse();
            }else {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
