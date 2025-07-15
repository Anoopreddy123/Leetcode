class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        int count = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                if(grid[i][j] == '1'){
                     count++;
                    bfs(i,j,grid);
                   
                }

            }
        }

        return count;

    }


    public void bfs(int i, int j, char[][] grid){


        if( i  < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0'){

            return ;
        }

        if(grid[i][j] == '1')
            grid[i][j] = '0';
        

             bfs(i - 1,j,grid); // up
              bfs(i + 1,j,grid); // down
               bfs(i,j - 1,grid); // left
                bfs(i,j + 1,grid); // right




    }

}