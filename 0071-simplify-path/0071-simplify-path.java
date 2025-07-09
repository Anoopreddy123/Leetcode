class Solution {
    public String simplifyPath(String path) {
        
        Stack<String> stack = new Stack<>();

        String[] st = path.split("/");
        System.out.print(Arrays.toString(st));
        for(String ch : st){

            if(ch.equals("")){
               continue;
            }else if(ch.equals("....") || ch.equals("...")){
                stack.push(ch);
            }else if(ch.equals("..")){
                if(!stack.isEmpty())
                    stack.pop();
            }else if(ch.equals(".")){
                continue;
            }else{
                stack.push(ch);
            }

        }


        String res = "";

     while(!stack.isEmpty()){

                 res =  "/" +stack.pop() + res ;

     }
return res.isEmpty() ? "/" : res;
    }
}