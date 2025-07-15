class Solution {
    public int maxArea(int[] height) {
        //int left_max = 0, right_max = 0;
        int size = height.length;
        int i = 0, j = size- 1;
        int area = 0, max_area = 0;
        while(i < j){
           
            if(height[i] > height[j]){

                area = Math.max(area, height[j] * ( j - i));
                j--;
            }else{
                area = Math.max(area, height[i] * ( j - i));
                i++;
            }


        }

        return area;

    }
}