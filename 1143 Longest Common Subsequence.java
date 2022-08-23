class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int storage[][] = new int[m+1][n+1];
        for(int i = 0; i <= m; i++) {
            storage[i][0] = 0;
        }
        for(int i = 0; i <= n; i++) {
            storage[0][i] = 0;
        }
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n;j++) {
                if(text1.charAt(m - i) == text2.charAt(n - j)) {
                    storage[i][j] = 1 + storage[i-1][j-1];
                }else {
                    storage[i][j] = Math.max(storage[i][j -1], storage[i-1][j]);
                }
            }
        }
        return storage[m][n];
    }
}
