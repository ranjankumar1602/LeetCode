class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int absVal = Integer.MAX_VALUE;
        int negative = 0;
        for(int[] row : matrix) {
            for(int i : row) {
                sum += Math.abs(i);
                if(i < 0) {
                    negative++;
                }
                absVal = Math.min(absVal, Math.abs(i));
            }
        }
        if(negative % 2 != 0) {
            sum -= 2 * absVal;
        }
        return sum;
    }
}
