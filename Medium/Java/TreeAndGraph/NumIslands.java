class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i ++) {
            for (int j = 0; j < grid[i].length; j ++) {
                if (grid[i][j] == '1') {
                    change(grid, i, j);
                    count ++;
                }
            }
        }
        return count;
    }
    
    public void change(char[][] grid, int i, int j) {
        if (i < grid.length && i >= 0 && j < grid[i].length && j >= 0 && grid[i][j] == '1') {
            grid[i][j] = '2';
            change(grid, i + 1, j);
            change(grid, i - 1, j);
            change(grid, i, j + 1);
            change(grid, i, j - 1);
        }
    }
}
