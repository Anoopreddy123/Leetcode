class Solution {
    public int[] twoSum(int[] arr, int target) {
        int i = 0, j = arr.length-1;
        int[] results = new int[2];
        while(i<=j){
            
            if(arr[i] + arr[j] == target){
                results[0] = i + 1;
                results[1] = j + 1;
                break;
            }
            else if(arr[i] + arr[j] < target){
                i++;
            }else{
                j--;
            }
            
        }
        
        return results;
    }
}