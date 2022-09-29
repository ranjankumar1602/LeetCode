class Solution {
    public int countAsterisks(String s) {
        Stack<Character> stack = new Stack<Character>();
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '|') {
                if(!stack.isEmpty() && stack.peek() == '|') {
                    stack.pop();
                }else {
                    stack.push(s.charAt(i));
                }
            }
            if(stack.isEmpty() && s.charAt(i) == '*') {
                count++;
            }
        }
        return count;
    }
}
