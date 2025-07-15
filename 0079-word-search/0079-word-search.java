class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for(int i = 0; i <m; i++){
            for(int j = 0; j <n; j++){
                char ch = word.charAt(0);
                if(board[i][j] == ch){
                    if (dfs(i , j, board, word, 0)){
                        return true;
                    }
                }
            }
        }

        return false;
    }


    public static boolean dfs(int i, int j, char[][] grid, String word, int index){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j]== '#' || index >= word.length() || grid[i][j] != word.charAt(index)){
            return false;
        }

        if(index == word.length() - 1){
            return true;
        }
        
        char temp = grid[i][j];
        if(grid[i][j] == word.charAt(index)){

          grid[i][j] = '#';
        }
        index += 1;
        if(
                 dfs(i + 1, j, grid, word, index) ||  dfs(i -  1, j, grid, word, index) ||
                  dfs(i , j + 1, grid, word, index) ||  dfs(i , j - 1, grid, word, index)
        ){
            return true;
        }else{
        grid[i][j] = temp;
        }
return false;
       
    }


}