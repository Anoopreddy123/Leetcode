class Solution {
    public int compress(char[] chars) {
         int left = 0, right = 0;
        int index = 0;
         while(right < chars.length){
            char temp = chars[right];
             int count = 0;
                while(right < chars.length && chars[right] == temp){
                    count++;
                    right++;
                }
            chars[index++] = temp;

            if(count > 1){
                String str = String.valueOf(count);
                for(char c : str.toCharArray()){
                    chars[index++] = c;
                }
            }

        }

        return index;

    }
}