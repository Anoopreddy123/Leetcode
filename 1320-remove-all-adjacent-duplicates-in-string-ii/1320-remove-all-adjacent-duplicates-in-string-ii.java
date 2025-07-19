class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> stack = new Stack<>();
        Stack<Integer> count = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                 count.push(count.pop() + 1);
            } else {
              count.push(1);
            }

            stack.push(c);

            if (count.peek() == k) {
                int cnt = k;
                while (cnt-- > 0 && !stack.isEmpty()) {
                    stack.pop();
                }
               count.pop(); // reset count for this char
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}