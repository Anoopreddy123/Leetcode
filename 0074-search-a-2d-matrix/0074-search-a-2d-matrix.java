class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;

        int start = 0, end = n - 1;

        while(start < m && end >= 0){

           // int mid = end - (start + end)/2;

            if(matrix[start][end] == target){
                return true;
            }

            if(matrix[start][end] < target){
                start += 1;
            }else{
                end -= 1;
            }

        }

        return false;
    }
}