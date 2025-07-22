class Solution {
    public String[] phoneNumber = {
        "#", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {

        
        List<String> result = new ArrayList<>();
        

        if(digits.length() == 0){
            return result;
        }

        backtrack(result, new StringBuilder(), digits, 0);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder sb, String digits, int index) {
        
        if(index == digits.length()){
            result.add(sb.toString());
            return;
        }
        String letters = phoneNumber[digits.charAt(index) - '0' - 1];
        for(char c : letters.toCharArray()){
            sb.append(c);
            backtrack(result, sb, digits,index + 1);
            sb.deleteCharAt(sb.length() - 1);

        }

    }

}
