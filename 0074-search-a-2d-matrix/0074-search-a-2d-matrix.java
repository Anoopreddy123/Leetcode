class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0, end = matrix[0].length -  1;

        int m = matrix.length, n = matrix[0].length;
        while(start < m && end >= 0){

           // int mid = ( end - start)/2;

            if(matrix[start][end] == target){
                return true;
            }

            if(matrix[start][end] > target ){
              end--;
            }else{
               start++;
            }

        }

        return false;
    }
}