class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map= new HashMap<>();
        for(int i=0; i<s.length();i++) {
            char temp= s.charAt(i);
            if(!map.containsKey(temp)) {
                map.put(temp,i);
            }else {
                map.put(temp,-1);
            }
        }
        int ans=Integer.MAX_VALUE;
        for(char temp:map.keySet()) {
            if(map.get(temp) > -1 && map.get(temp)<ans) {
                ans=map.get(temp);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
