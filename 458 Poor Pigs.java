class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int time = (minutesToTest / minutesToDie) + 1;
        int pigs = 0;
        int temp = 1;
        while(temp < buckets) {
            temp *= time;
            pigs++;
        }
        return pigs;
    }
}
