class Solution {
    private void numIslands(char[][] grid, int row, int col) {
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] != '1') {
            return;
        }
        grid[row][col] = '0';
        numIslands(grid, row, col - 1);
        numIslands(grid, row, col + 1);
        numIslands(grid, row - 1, col);
        numIslands(grid, row + 1, col);
    }
    public int numIslands(char[][] grid) {
        int island = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    numIslands(grid, i, j);
                    island++;
                }
            }
        }
        return island;
    }
}
