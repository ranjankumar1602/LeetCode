class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int storage[][] = new int[m+1][n+1];
        for(int i = 0; i <= m; i++) {
            storage[i][0] = i;
        }
        for(int j = 0; j <= n; j++) {
            storage[0][j] = j;
        }
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(word1.charAt(m-i) == word2.charAt(n-j)) {
                    storage[i][j] = storage[i-1][j-1];
                }else {
                    storage[i][j] = 1 + Math.min(storage[i][j-1], Math.min(storage[i-1][j], storage[i-1][j-1]));
                }
            }
        }
        
        
        return storage[m][n];
    }
}
