class Solution {
    public int trap(int[] height) {
        
        int size = height.length;
        int[] leftMax = new int[size];
        int[] rightMax = new int[size];

        rightMax[size-1] = height[size-1];

        for(int i = size-2; i >=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        leftMax[0] = height[0];
        for(int i = 1; i < size; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //int[] res = new int[size];
        int count = 0;
        for(int i = 0;i < size; i++){

            count += Math.min(leftMax[i], rightMax[i]) - height[i];
            

        }


        return count;
    }
}