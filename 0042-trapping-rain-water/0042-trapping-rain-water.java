class Solution {
    public int trap(int[] height) {
        int size = height.length;
        int leftMax = 0, rightMax = 0;
        int i = 0, j = size - 1;
        int res = 0;

        while(i < j){

            if(height[i] < height[j]){
                    
                if(leftMax > height[i]){
                    res += leftMax - height[i];
                }else{
                    leftMax = height[i];
               
                }

                     i++;


            }else{


                    if(rightMax > height[j]){
                    res += rightMax - height[j];
                }else{
                    rightMax = height[j];
                  
                }

                j--;

            }


        }

        return res;
    }
}