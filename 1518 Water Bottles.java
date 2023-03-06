class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = 0;
        int newBottles = 0;
        while(numBottles > 0) {
            sum += numBottles;
            newBottles += numBottles;
            numBottles = newBottles / numExchange;
            newBottles %= numExchange;
        }
        return sum;
    }
}
