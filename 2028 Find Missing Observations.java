class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        // formula  x + sum / m + n = mean
        // x = (m+n) * mean - sum
        // total outcomes = mean * sides of dice
        // total dice possibility = 2 * 6
        // sum of remaining dice outcomes = total outcoms - total dice possibility
        int sum = 0;
        int m = rolls.length;
        int totalSum = mean * (m + n);

        for(int roll : rolls) {
            sum += roll;
        }

        int missingSum = totalSum - sum;

        if(missingSum < n || missingSum > 6 * n) {
            return new int[0];
        }

        int base = missingSum / n;
        int rem = missingSum % n;
        
        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            result[i] = base + (i < rem ? 1 : 0);
        }

        return result;
    }
}
