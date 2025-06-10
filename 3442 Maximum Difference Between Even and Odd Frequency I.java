class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> ch = new HashMap<>();
        for(char c : s.toCharArray()) {
            ch.put(c, ch.getOrDefault(c, 0) + 1);
        }
        int maxOdd = 1, minEven = s.length();
        for(int i : ch.values()) {
            if(i % 2 == 1) {
                maxOdd =Math.max(maxOdd, i);
            }else {
                minEven = Math.min(minEven, i);
            }
        }
        return maxOdd - minEven;
    }
}
