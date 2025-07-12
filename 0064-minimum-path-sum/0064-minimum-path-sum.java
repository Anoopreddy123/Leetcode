class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Integer[][] dp = new Integer[m][n];

        return dfs( 0,  0, grid, dp);
    }


    public static int dfs(int m, int n, int[][] grid, Integer[][] dp){

        if(m >= grid.length || n >=grid[0].length){
            return Integer.MAX_VALUE;
        }


        if(m == grid.length - 1 && n == grid[0].length - 1){
            return grid[m][n];
        }
        if(dp[m][n] != null){
            return dp[m][n];
        }


               int right = dfs(m, n + 1, grid, dp);
                int down = dfs(m + 1, n,grid, dp);

                dp[m][n] = grid[m][n] + Math.min(down,right);

                return dp[m][n];

    }
}