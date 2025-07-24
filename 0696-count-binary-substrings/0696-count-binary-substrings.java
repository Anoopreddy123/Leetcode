class Solution {
    public int countBinarySubstrings(String s) {
        int curr = 1, prev = 0;
        int count = 0;
        int i = 1;
        while(i < s.length()){

            if(s.charAt(i) != s.charAt(i - 1)){

                count += Math.min(curr,prev);
                prev = curr;
                curr = 1;

            }else{
                curr++;
            }

            i++;
        }

        return count += Math.min(prev, curr);
    }
}