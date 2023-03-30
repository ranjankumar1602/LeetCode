class Solution {
    public int countDigits(int num) {
        int tempNum = num;
        int count = 0;
        while(tempNum > 0) {
            int digit = tempNum % 10;
            if(num % digit == 0) {
                count++;
            }
            tempNum /= 10;
        }
        return count;
    }
}
