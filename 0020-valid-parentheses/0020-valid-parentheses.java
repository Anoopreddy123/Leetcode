class Solution {
    public boolean isValid(String s) {
        boolean changed = true;

        while (changed) {
            String temp = s;
            s = s.replace("()", "")
                 .replace("[]", "")
                 .replace("{}", "");
            changed = !s.equals(temp);  // check if any replacements occurred
        }

        return s.isEmpty();
    }
}