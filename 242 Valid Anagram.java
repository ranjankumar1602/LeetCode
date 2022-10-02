class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if(map.containsKey(a)) {
                map.put(a, map.get(a)+1);
            }else {
                map.put(a,1);
            }
        }
        for(int i = 0; i < t.length(); i++) {
            char a = t.charAt(i);
            if(map.containsKey(a) && map.get(a) >= 1) {
                map.put(a, map.get(a)-1);
            }else {
                return false;
            }
        }
        return true;
    }
}
