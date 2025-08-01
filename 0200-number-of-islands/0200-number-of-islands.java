class Solution {
    public int numIslands(char[][] grid) {
        
        int count = 0;
        int m = grid.length, n = grid[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1'){
                    count++;
                    bfs(grid,m , n, i, j);
                }
            }
        }
        return count;
    }

    public void bfs(char[][] grid, int m, int n, int i , int j){

        if( i < 0 || j < 0 || i >= m || j >= n || grid[i][j] != '1'){
            return ;
        }
            grid[i][j] = '0';
            bfs(grid,m , n, i + 1, j);
            bfs(grid,m , n, i - 1, j);
            bfs(grid,m , n, i, j + 1);
            bfs(grid,m , n, i, j - 1);
    }
}