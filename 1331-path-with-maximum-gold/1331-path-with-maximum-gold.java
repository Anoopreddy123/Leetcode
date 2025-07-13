class Solution {

    public int maxRes = 0;
    public int getMaximumGold(int[][] grid) {
        //int maxRes = 0;
        for(int i =0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){

                if(grid[i][j] != 0){
                    dfs(i, j, grid,0);
                }

            }   
        }

        return maxRes;
    }


    public void dfs(int i, int j, int[][] grid, int curr){

        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0){
            return ;
        }

        int temp = grid[i][j];
        grid[i][j] = 0;
        curr += temp;
        maxRes = Math.max(maxRes , curr);

        dfs(i + 1, j, grid, curr);
        dfs(i, j+1, grid, curr);
          dfs(i, j - 1, grid, curr);
        dfs(i - 1, j, grid, curr);
        grid[i][j] = temp;

    }
}