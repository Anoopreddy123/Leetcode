class Solution {
    public int maxArea(int[] height) {
        int sum = 0;

        int l = 0, r = height.length - 1;
        int leftMin = 0, rightMin = 0;
        int area = 0, max = 0;
        while(l < r){

            if(height[l] < height[r]){
                area = Math.max(area, height[l] * (r-l));
                l++;
            }else{
               area = Math.max(area, height[r] * (r-l));
                r--;
            }

            
            max = Math.max(max, area);


        } 

        return max;
    }
}