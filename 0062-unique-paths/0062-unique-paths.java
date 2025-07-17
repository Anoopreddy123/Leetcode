class Solution {
    public int uniquePaths(int m, int n) {
          
             int[][] memo = new int[m][n];
                return dfs(0, 0, m, n, memo);
            // int count = dfs(i, j, m,n);

            // return count;

    }


    public static int dfs(int i, int j, int m, int n, int[][] memo){


            if(i < 0 || j < 0 || i >=m || j >= n){
                return 0;
            }

 if (i == m - 1 && j == n - 1) return 1;
            if (memo[i][j] != 0) return memo[i][j];

        memo[i][j] = dfs(i + 1, j, m, n, memo) + dfs(i, j + 1, m, n, memo);
        return memo[i][j];




        
    }
}