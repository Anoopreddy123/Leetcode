class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0, high = letters.length;
        int size = letters.length;

        while(low < high){
            int mid = (low + (high - low)/2);
          
            if(letters[mid] > target){
                    high = mid;
            }else{
                low = mid + 1;
            }
        }

        return letters[low % size];
    }
}