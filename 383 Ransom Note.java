class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < magazine.length(); i++) {
            char ans = magazine.charAt(i);
            if(map.containsKey(ans)) {
                map.put(ans,map.get(ans) + 1);
            }else {
                map.put(ans, 1);
            }
        }
        for(int i = 0; i < ransomNote.length(); i++) {
            char ans = ransomNote.charAt(i);
            if(!map.containsKey(ans)) {
                return false;
            }
            if(map.containsKey(ans) && map.get(ans) < 1) {
                return false;
            }else {
                map.put(ans, map.get(ans) - 1);
            }
        }
        return true;
    }
}
