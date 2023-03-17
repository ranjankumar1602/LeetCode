class Solution {
    public String defangIPaddr(String address) {
        String replace = "[.]";
        String ans = "";
        for(int i = 0; i < address.length(); i++) {
            if(address.charAt(i) == '.') {
                ans += replace;
            }else {
                ans += address.charAt(i);
            }
        }
        return ans;
    }
}

/*
class Solution {
    public String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        for(char c: address.toCharArray()) {
            str.append(c=='.'?"[.]":c);
        }
        return str.toString();
    }
}
*/

/*
class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
*/
