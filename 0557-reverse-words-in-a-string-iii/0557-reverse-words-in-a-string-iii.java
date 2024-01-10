class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        String result = "";
        for(int i =0;i<str.length;i++){
            System.out.println(str[i]);
            StringBuilder sb = new StringBuilder(str[i]);
            result = result + sb.reverse() + " ";
        }
        return result.trim();
    }
}