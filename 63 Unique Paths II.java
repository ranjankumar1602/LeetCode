class Solution {
    int[][] dp;
    private int uniquePathsWithObstacles(int[][] obstacleGrid, int row, int col) {
        if(row < 0 || col < 0 || row == obstacleGrid.length || col == obstacleGrid[0].length || obstacleGrid[row][col] == 1) {
            return 0;
        }
        if(row == obstacleGrid.length - 1 && col == obstacleGrid[0].length - 1) {
            return 1;
        }
        if(dp[row][col] > -1) {
            return dp[row][col];
        }
        dp[row][col] = uniquePathsWithObstacles(obstacleGrid, row + 1, col) + uniquePathsWithObstacles(obstacleGrid, row, col + 1);
        return dp[row][col];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return uniquePathsWithObstacles(obstacleGrid, 0, 0);
    }
}
