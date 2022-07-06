class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty()){
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char temp= s.charAt(i);
            if(temp=='(' || temp=='{' || temp=='[') {
                stack.push(temp);
            }else if(temp==')' || temp=='}' || temp==']') {
                if(stack.isEmpty()) {
                    return false;
                }
                if(temp==')' && stack.peek()=='(' || temp=='}' && stack.peek()=='{' || temp==']' && stack.peek()=='[') {
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
