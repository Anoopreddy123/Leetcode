class Solution {
    public int maximum69Number (int num) {

        String numStr = Integer.toString(num);
        return Integer.parseInt(numStr.replaceFirst("6", "9"));
    }
}