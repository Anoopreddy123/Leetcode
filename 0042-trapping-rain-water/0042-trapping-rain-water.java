class Solution {
    public int trap(int[] arr) {
        int leftMax = 0, rightMax = 0;
        int res = 0;
        int l = 0, r = arr.length-1;

        while(l <=r){

            if(arr[l] < arr[r]){
                if(leftMax >= arr[l]){
                    res += leftMax- arr[l];
                   
                }else{
                    leftMax = arr[l];
                }
                 l++;
            }else{
                if(rightMax >= arr[r]){
                    res += rightMax - arr[r];
                   
                }else{
                    rightMax = arr[r];
                }
                 r--;
            }


        }

        return res;
    }
}