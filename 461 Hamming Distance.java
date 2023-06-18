class Solution {
    public int hammingDistance(int x, int y) {
        String ans = Integer.toBinaryString(x^y);
        int distance = 0;
        for(char c : ans.toCharArray()) {
            if(c == '1') {
                distance++;
            }
        }
        return distance;
    }
}
