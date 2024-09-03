class Solution {
    public int getLucky(String s, int k) {
        String num = "";
        for(char ch : s.toCharArray()) {
            num += Integer.toString(ch - 'a' + 1);
        }
        while(k-- > 0) {
            int ans = 0;
            for(char ch : num.toCharArray()) {
                ans += ch -'0';
            }
            num = Integer.toString(ans);
        }
        return Integer.parseInt(num);
    }
}
