class Solution {
    public String decodeString(String s) {
        // given input  3[a]2[bc] || 3[a2[c]] -> 3[acc] -> accaccacc
        Stack<Integer> stack = new Stack();
        Stack<String> charTemp = new Stack();
        String nums = "";
        String str = "";
        String res = "";
       
        for(char ch : s.toCharArray()){

                if(Character.isDigit(ch)){
                    nums += ch;
                }else if(ch == '['){
                    stack.push(Integer.parseInt(nums));
                    charTemp.push(str);
                    nums="";
                    str = ""; 
                }else if(ch == ']'){ 
                    StringBuilder sb = new StringBuilder();
                    int count = stack.pop();
                    for(int i =0; i < count; i++){
                        sb.append(str);
                    }

                   //str+=sb.toString();
                   str = charTemp.pop() + sb.toString();
                
                }else{
                    str+=ch;
                }
                System.out.print(res);

        }
            
        return str;
    }
}