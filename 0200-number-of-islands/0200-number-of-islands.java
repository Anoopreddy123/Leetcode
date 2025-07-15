class Solution {
    public int numIslands(char[][] grid) {
        // BFS go all possible direction up down left right

        int count = 0;
        int m = grid.length, n = grid[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                if(grid[i][j] == '1'){
                    bfs(grid, i, j);
                    count++;
                }

            }
        }

        return count;
    }

    public static void bfs(char[][] grid, int i, int j){

        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0'){
            return;
        }


        if(grid[i][j] == '1'){

            grid[i][j] = '0';
        }

            bfs(grid, i, j - 1); // up
            bfs(grid, i, j + 1); // down
            bfs(grid, i - 1, j); // left
            bfs(grid, i + 1, j);  // right


    }
}