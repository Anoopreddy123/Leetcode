class Solution {
    public int uniquePaths(int m, int n) {
        int ans = 0;
        int[][] dp = new int[m][n];
       
                ans += helper(m, n, 0 ,0, dp);
      
        return ans;
    }

    public static int helper(int m, int n, int i, int j, int[][] dp){

        if( i < 0 || j < 0 || i >=m || j >= n){
            return 0;
        }
        int count = 0;
        if(i == m-1 && j ==  n-1) return 1;
        if(dp[i][j] != 0){
            return dp[i][j];
        }

        count += helper(m, n, i+ 1,j, dp);
     
          count += helper(m, n, i ,j + 1, dp);
         

        return dp[i][j] = count;
    }
}