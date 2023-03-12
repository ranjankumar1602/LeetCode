class Solution {
    public int diagonalSum(int[][] mat) {
        int left = 0;
        int right = 0;
        int ans = 0;
        for(int i = 0; i < mat.length; i++) {
            left += mat[i][i];
        }
        int j = 0;
        for(int i = mat.length - 1; i >= 0; i--) {
            right += mat[j][i];
            j++;
        }
        ans = left + right;
        if(mat.length % 2 != 0) {
            ans = ans - mat[(mat.length)/2][(mat.length)/2];
        }
        return ans;
    }
}
