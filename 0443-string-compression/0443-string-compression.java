class Solution {
    public int compress(char[] chars) {
         int right = 0;
      
        int index = 0;
        while(right < chars.length){
              char temp = chars[right];
       int count = 0;
            while(right < chars.length && chars[right] == temp){
                count++;
                 right++;
            }
            chars[index++] = temp;
            //temp = chars[right];
  
           if (count > 1) {
                String str = String.valueOf(count);
                for (char c : str.toCharArray()) {
                    chars[index++] = c;
                }
            }

        }

        return index;
    }
}