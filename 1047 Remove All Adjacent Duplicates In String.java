class Solution {
    public String removeDuplicates(String s) {
        String ans = "";
        Stack<Character> stack = new Stack<Character>();
        stack.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++) {
            char temp = s.charAt(i);
            if(stack.isEmpty() || stack.peek() != temp) {
                stack.push(temp);
            }else {
                stack.pop();
            }
        }
        while(!stack.isEmpty()) {
            ans = stack.pop() + ans;
        }
        return ans;
    }
}
