class Solution {
    public int singleNumber(int[] arr) {
      
        Arrays.sort(arr);
         int i = 0;
        int j = 1;
if(arr.length == 1){
    return arr[0];
}
        while(j<arr.length - 1){

            if(arr[i] == arr[j]){
                  i = i+2;
                  j = j+2;
            }else{
                return arr[i];
            }

        }
        if(arr[i - 1]!= arr[j - 1]){
            return arr[i];
        }
        return 0;
    }
}