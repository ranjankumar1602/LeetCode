class Solution {
    private int dfs(int[][] grid, int x, int y, int zero) {
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == -1) {
            return 0;
        }
        if(grid[x][y] == 2) {
            return zero == -1 ? 1 : 0;
        }
        grid[x][y] = -1;
        zero--;
        int path = dfs(grid, x+1, y, zero) + dfs(grid, x, y + 1, zero) + dfs(grid, x-1, y, zero) + dfs(grid, x, y - 1, zero);
        grid[x][y] = 0;
        zero++;

        return path;
    }
    public int uniquePathsIII(int[][] grid) {
        int zero = 0;
        int x = 0, y = 0;
        for(int row = 0; row < grid.length; row++) {
            for(int col = 0; col < grid[0].length; col++) {
                if(grid[row][col] == 0) {
                    zero++;
                }else if(grid[row][col] == 1) {
                    x = row;
                    y = col;
                }
            }
        }
        return dfs(grid, x, y, zero);
    }
}
