class Solution {
    public String decodeString(String s) {
       
        Stack<Integer> nums = new Stack<>();
        Stack<String> temp = new Stack<>();
        String num = "";
        String str = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                num += ch;
            }else if(ch == '['){
                nums.push(Integer.parseInt(num));
                temp.push(str);
                num = "";
                str = "";
            }else if(ch == ']'){
                int count = nums.pop(); 
                StringBuilder sb = new StringBuilder();
                for(int it = 0; it < count; it++){
                    sb.append(str);
                }
                str = temp.pop() + sb.toString();
            }else{
                str += ch;
            }
        }

        return str;
    }
}