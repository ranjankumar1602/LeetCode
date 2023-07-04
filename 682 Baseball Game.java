class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String str : operations) {
            if(str.equals("+")) {
                int peek = stack.pop();
                int sum = peek + stack.peek();
                stack.push(peek);
                stack.push(sum);
            }else if(str.equals("C")) {
                stack.pop();
            }else if(str.equals("D")) {
                stack.push(2 * stack.peek());
            }else {
                stack.push(Integer.valueOf(str));
            }
        }
        int ans = 0;
        for(int i : stack) {
            ans += i;
        }
        return ans;
    }
}
