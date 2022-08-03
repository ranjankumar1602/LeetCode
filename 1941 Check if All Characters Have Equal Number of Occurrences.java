class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map= new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if(map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            }else {
                map.put(temp, 0);
            }
        }
        int prev = map.get(s.charAt(0));
        for(char i:map.keySet()) {
            if(map.get(i) != prev) {
                return false;
            }
        }
        return true;
    }
}
