class Solution {
    public int maxArea(int[] arr) {

            int left = 0, right = arr.length - 1;
            int area = 0, max_area = 0;

            while(left < right){

                    area = Math.min(arr[left], arr[right]) * (right - left );
                    max_area = Math.max(max_area, area);

                    if(arr[left] < arr[right]){
                        left++;
                    }else{
                        right--;
                    }

            }

            return max_area;

    }
}