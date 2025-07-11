class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int temp = image[sr][sc];
        helper(image, sr, sc, color, temp);
        
       
        return image;
    }


    public void helper(int[][] arr, int i, int j, int color, int temp){

        if( i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == color)
         return ;
            if(arr[i][j] == temp){
                arr[i][j] = color;

         helper(arr, i + 1, j, color, temp);
         helper(arr, i - 1, j, color, temp);
         helper(arr, i, j + 1, color, temp);
         helper(arr, i, j - 1, color, temp);
            }

    }
}