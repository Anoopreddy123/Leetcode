class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        
        int row = matrix.length;
        int column = matrix[0].length;
        int row_count = 0;
        
           
        for (int rowCount = 0; rowCount < row; rowCount++) {
            int start = 0;
            int end = column - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2; // avoid potential overflow
                System.out.println("row, column: " + rowCount + " " + mid);

                if (matrix[rowCount][mid] == target) {
                    System.out.println("row, column: " + rowCount + " " + mid + " " + matrix[rowCount][mid]);
                    return true;
                } else if (matrix[rowCount][mid] < target) {
                    System.out.println("row, column: " + rowCount + " " + mid + " " + matrix[rowCount][mid]);
                    start = mid + 1;
                } else {
                    System.out.println("row, column else: " + rowCount + " " + mid + " " + matrix[rowCount][mid]);
                    end = mid - 1;
                }
            }
        }
        return false;
        
        
        
   
        
    }
}