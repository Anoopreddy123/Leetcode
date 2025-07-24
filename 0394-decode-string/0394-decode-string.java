class Solution {
    public String decodeString(String s) {
        String num = "";
        String str = "";

        Stack<String> nums = new Stack<>();
        Stack<String> seq = new Stack<>();
        

        for(char c : s.toCharArray()){

            if(Character.isDigit(c)){
                num+= c;
            }
            else if( c == '['){

                nums.push(num);
                seq.push(str);
                str = "";
                num = "";

            }else if(c == ']'){
StringBuilder sb = new StringBuilder();
                int count = Integer.parseInt(nums.pop());
                //String temp = seq.pop();
                for(int i = 0; i < count; i++){

                    sb.append(str);

                }


            str = (seq.pop() + sb.toString());

            }else{
                str += c;
            }

        }

        return str;
    }
}