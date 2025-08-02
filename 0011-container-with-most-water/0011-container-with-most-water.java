class Solution {
    public int maxArea(int[] arr) {

            int left = 0, right = arr.length - 1;
            int area = 0, max_area = 0;

            while(left < right){

                   if(arr[left] < arr[right]){
                        area = Math.max(area, arr[left] * (right - left));
                        left++;
                   }else{
                        area = Math.max(area, arr[right] * (right - left));
                        right--;
                   }

            }

            return area;

    }
}