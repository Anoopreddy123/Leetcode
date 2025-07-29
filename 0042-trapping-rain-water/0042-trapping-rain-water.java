class Solution {
    public int trap(int[] height) {
        
        int left = 0 , right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int sum = 0;
        while(left <=right){

            if(height[left] < height[right]){
                
                    if(leftMax >= height[left]){
                        sum += leftMax - height[left];
                    }else{
                        leftMax = height[left];
                    }

                left++;
            }else{
                 if(rightMax >= height[right]){
                        sum += rightMax - height[right];
                    }else{
                        rightMax = height[right];
                    }

                    right--;
            }
        }

        return sum;

    }
}