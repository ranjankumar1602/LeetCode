class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int idx : chalk) {
            sum += idx;
        }
        while(k >= sum) {
            k %= sum;
            
        }
        int i = 0;
        while(k >= chalk[i]) {
            k -= chalk[i];
            i++;
            
        }
        return i;
    }
}
