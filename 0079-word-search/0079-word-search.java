class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length, cols = board[0].length;

        int[][] visited = new int[row][cols];
        int index = 0;
        boolean temp = false;
        for(int i =0; i < row; i++){
            temp = false;
            for(int j = 0; j <cols; j++){
                //if(visited[i][j] == 0 ) continue;
                System.out.println(board[i][j] == (word.charAt(index)));
                if(board[i][j] == (word.charAt(index))){
                    
                   temp =  dfs(board, visited, i, j,index, word);
                    //visited[i][j] = 0;
                    System.out.println(temp);
                    if(temp) return true;
                }
            }
        }

        return false;
    }

    public static boolean dfs(char[][] board, int[][] visited, int i, int j, int index, String word){

        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || index >= word.length() || board[i][j] != (word.charAt(index))){
            return false;
        }
        if(index == word.length() - 1){
            return true;
        }
        if(board[i][j] != (word.charAt(index)) ){
            //System.out.print(board[i][j] + "--");
            return false;
        }

        char temp = board[i][j];
         board[i][j] = '#';


        index += 1;
        
         if((dfs(board, visited, i + 1, j, index , word)) || (dfs(board, visited, i, j + 1, index, word)) || (dfs(board, visited, i-1, j, index , word)) ||
            (dfs(board, visited, i, j-1, index, word))){
                board[i][j] = temp;
                return true;
            }

 

    return false;

    }
    
}