class Solution {
    private int area(int[][] grid, int row, int col, boolean[][] visited) {
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0 || visited[row][col]) {
            return 0;
        }
        visited[row][col] = true;
        int left = area(grid, row, col - 1, visited);
        int right = area(grid, row, col + 1, visited);
        int up = area(grid, row - 1, col, visited);
        int down = area(grid, row + 1, col, visited);
        return 1 + left + right + up + down;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        for(int row = 0; row < grid.length; row++) {
            for(int col = 0; col < grid[0].length; col++) {
                ans = Math.max(ans, area(grid, row, col, new boolean[grid.length][grid[0].length]));
            }
        }
        return ans;
    }
}
