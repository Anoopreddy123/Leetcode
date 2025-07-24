class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Integer> count = new Stack<>();
        Stack<Character> chars = new Stack<>();
        int strLen = s.length();
        int left = 0;
        int right = 0;
        int counts = 0;
        while(right < strLen){
            char c = s.charAt(right);
            if(!count.isEmpty() && chars.peek() == c){

                count.push(count.pop() + 1);

            }else{
                count.push(1);
            }

            chars.push(c);

            if(count.peek() ==  k){
                counts = count.pop();

                while(counts-- > 0){
                    chars.pop();
                }

                //count.pop();

            }

            right++;

        }

        StringBuilder sb = new StringBuilder();

        while(!chars.isEmpty()){
            sb.append(chars.pop());
        }


        return sb.reverse().toString();
    }
}