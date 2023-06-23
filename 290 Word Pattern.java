class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map map = new HashMap<>();
        String[] str = s.split(" ");
        if(str.length != pattern.length()) {
            return false;
        }
        for(Integer i = 0; i < pattern.length(); i++) {
            if(map.put(pattern.charAt(i), i) != map.put(str[i], i)) {
                return false;
            }
        }
        return true;
    }
}
