class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;

        int start = 0, end = n - 1;

        while(start < end){

            int mid = end - (start + end)/2;

            if(matrix[start][mid] == target){
                return true;
            }

            if(matrix[start][mid] < target){
                start = mid + 1;
            }else{
                end = end - 1;
            }

        }

        return false;
    }
}