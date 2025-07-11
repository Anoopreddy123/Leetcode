class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] timeGrid = new int[m][n];

        // Initialize timeGrid with max values
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                timeGrid[i][j] = Integer.MAX_VALUE;

        // Start DFS from all rotten oranges
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    dfs(grid, timeGrid, i, j, 0);
                }
            }
        }

        // Check for unreachable fresh oranges and get max time
        int maxTime = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    if (timeGrid[i][j] == Integer.MAX_VALUE)
                        return -1;
                    maxTime = Math.max(maxTime, timeGrid[i][j]);
                }
            }
        }

        return maxTime;
    }

    public void dfs(int[][] grid, int[][] timeGrid, int i, int j, int time) {
        int m = grid.length;
        int n = grid[0].length;

        // Boundary or empty cell
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0)
            return;

        // Only propagate if we're improving time
        if (time >= timeGrid[i][j])
            return;

        timeGrid[i][j] = time;

        dfs(grid, timeGrid, i + 1, j, time + 1);
        dfs(grid, timeGrid, i - 1, j, time + 1);
        dfs(grid, timeGrid, i, j + 1, time + 1);
        dfs(grid, timeGrid, i, j - 1, time + 1);
    }
}