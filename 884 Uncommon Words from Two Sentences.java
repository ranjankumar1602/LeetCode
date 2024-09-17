class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap();
        for(String str : s1.split(" ")) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        for(String str : s2.split(" ")) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        ArrayList<String> result = new ArrayList<String>();
        for(String str : map.keySet()) {
            if(map.get(str) == 1) {
                result.add(str);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
