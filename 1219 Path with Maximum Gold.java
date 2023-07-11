class Solution {
    private int getMaximumGold(int[][] grid, int row, int col, int m, int n, boolean visited[][]) {
        if(row < 0 || col < 0 || row >= m || col >= n || grid[row][col] == 0 || visited[row][col]) {
            return 0;
        }
        visited[row][col] = true;
        int left = getMaximumGold(grid, row, col - 1, m, n, visited);
        int right = getMaximumGold(grid, row, col + 1, m, n, visited);
        int up = getMaximumGold(grid, row - 1, col, m, n, visited);
        int down = getMaximumGold(grid, row + 1, col, m, n, visited);
        visited[row][col] = false;
        return grid[row][col] + Math.max(left, Math.max(right, Math.max(up, down)));
    }
    public int getMaximumGold(int[][] grid) {
        if(grid == null || grid.length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int max = 0;
        for(int row = 0; row < m; row++) {
            for(int col = 0; col < n; col++) {
                if(grid[row][col] > 0) {
                    int gold = getMaximumGold(grid, row, col, m, n, new boolean[m][n]);
                    max = Math.max(max, gold);
                }
            }
        }
        return max;
    }
}
