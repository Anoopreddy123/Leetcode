class Solution {
    public int countSubstrings(String s) {
        
        int count = 0;
        if(s.length()==0) 
        return 0;

        for(int i = 0; i < s.length(); i++){

            count += helper(s, i ,i);
           count += helper(s,i,i + 1);

        }

        return count;

    }

    public int helper(String s, int left, int right){

        int count = 0;

        while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){

         
            count++;
          left--;
          right++;
}
return count;
    }
}