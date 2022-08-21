class Solution {
    private int uniquePaths(int[][] storage, int i, int j) {
        int m = storage.length;
        int n = storage[0].length;
        if(i == m - 1 && j == n - 1) {
            return 1;
        }
        if(i >= m || j >= n) {
            return 0;
        }
        if(storage[i][j] != -1) {
            return storage[i][j];
        }
        storage[i][j] = uniquePaths(storage, i + 1, j) + uniquePaths(storage, i, j + 1);
        return storage[i][j];
    }
    
    public int uniquePaths(int m, int n) {
        int[][] storage = new int[m][n];
        for(int i = 0 ; i < m; i++) {
            for(int j = 0; j < n; j++) {
                storage[i][j] = -1;
            }
        }
        return uniquePaths(storage, 0, 0);
    }
}
