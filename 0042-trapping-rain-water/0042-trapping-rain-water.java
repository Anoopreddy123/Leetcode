class Solution {
    public int trap(int[] height) {
        int size = height.length;
        int left = 0, right = size - 1;   
        int leftMax = 0, rightMax = 0;
        int sum = 0;
        while(left <= right){

            if(height[left] < height[right]){

                if(leftMax < height[left]){
                    leftMax = height[left];
                }else{
                    sum += leftMax - height[left];
                }
                left++;

            }else{

                if(rightMax < height[right]){
                    rightMax = height[right];
                }else{
                    sum += rightMax - height[right];
                }

                right--;

            }


        }

        return sum;
    }
}