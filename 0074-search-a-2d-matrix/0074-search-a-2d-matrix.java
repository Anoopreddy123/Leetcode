class Solution {
   public boolean searchMatrix(int[][] mat, int target) {
   if(mat.length == 0){
            return false;
        }
        
        int n = mat[0].length;
        int m = mat.length;
        int i = 0, j = n-1;
       
 
        while (i < m && j >= 0)
        {
            if (mat[i][j] == target)
            {
                return true;
            }
            if (mat[i][j] > target)
                j--;
            else 
                i++;
        }
        return false;
    }
}