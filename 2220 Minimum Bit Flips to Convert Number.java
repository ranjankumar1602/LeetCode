class Solution {
    public int minBitFlips(int start, int goal) {
    // xor the start and goal and then return the count of the 1's of the result;
        return Integer.bitCount(start^goal);
    }
}
