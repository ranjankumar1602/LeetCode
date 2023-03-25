class Solution {
    private void transpose(int[][] matrix) {
        int len = matrix.length;
        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }

    private void reverse(int[][] matrix) {
        int len = matrix.length;
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][len-j-1];
                matrix[i][len-j-1] = temp;
            }
        }
    }

    public void rotate(int[][] matrix) {
        // to rotate 90 degree clock wise we can transpose and reverse the array
        transpose(matrix);
        reverse(matrix);
    }
}
