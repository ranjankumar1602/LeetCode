class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] str = s.toCharArray();
        int count = 0;
        for(char c : str){
            if(c == '('){
                stack.push('(');
            }else{
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }else{
                    count++;
                }
            }
        }
        return count + stack.size();
    }
}
