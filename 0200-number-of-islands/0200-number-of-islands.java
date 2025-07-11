class Solution {
    public int numIslands(char[][] isConnected) {


   // List<List<Integer>> adj = new ArrayList<>();

        int rows = isConnected.length;
        int cols = isConnected[0].length;
        int count = 0;
        //boolean[] visited = new boolean[size];
      for(int i = 0; i <rows ; i++){
            for(int j = 0; j < cols; j++){
            if(isConnected[i][j] == '1'){
                helper(i,j, isConnected);
                count++;
                
            }

            }
        }
  return count;
    }

        public void helper(int i, int j, char[][] arr){

            if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == '0') {
            return;
        }
            arr[i][j] = '0';

            helper(i-1, j , arr);   //go up
            helper(i+1, j , arr);   // go dowb
            helper(i, j - 1 , arr);
            helper(i, j + 1 , arr);

    }
}
   