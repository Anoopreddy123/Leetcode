class Solution {
     public static boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length;
        int row = matrix.length;

        int start = 0, end = row - 1;

        if (row == 1) {
            return search(matrix, target, 0, col - 1);
        }

        while (start <= end) {
            int mid = (start + end) / 2;
            System.out.println("Mid :" + mid);

            if (target >= matrix[mid][0] && target <= matrix[mid][col - 1]) {
                System.out.println("Inside If");
                return search(matrix, target, mid, col - 1);
            } else if (target < matrix[mid][0]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }

    public static boolean search(int[][] matrix, int target, int row, int endCol) {
        System.out.println("Inside search " + row + " " + endCol);
        for (int i = 0; i <= endCol; i++) {
            System.out.println("Inside search " + matrix[row][i]);
            if (matrix[row][i] == target) {
                return true;
            }
        }
        return false;
    }

}