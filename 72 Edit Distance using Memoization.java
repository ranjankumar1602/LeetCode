class Solution {
    
    private int minDistance(String word1, String word2, int storage[][]) {
        int m = word1.length();
        int n = word2.length();
        if(storage[m][n] != -1) {
            return storage[m][n];
        }
        if(m == 0) {
            storage[m][n] = n;
            return storage[m][n];
        }
        if(n == 0) {
            storage[m][n] = m;
            return storage[m][n];
        }
        if(word1.charAt(0) == word2.charAt(0)) {
            storage[m][n] = minDistance(word1.substring(1), word2.substring(1), storage);
        }else {
            int op1 = minDistance(word1, word2.substring(1), storage);
            int op2 = minDistance(word1.substring(1), word2, storage);
            int op3 = minDistance(word1.substring(1), word2.substring(1), storage);
            storage[m][n] = 1 + Math.min(op1, Math.min(op2, op3));
        }
        return storage[m][n];
    }
    
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int storage[][] = new int[m+1][n+1];
        for(int i = 0; i < storage.length; i++) {
            for(int j = 0; j < storage[0].length; j++) {
                storage[i][j] = -1;
            }
        }
        return minDistance(word1, word2, storage);
    }
}
