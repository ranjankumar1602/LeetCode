class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int idx = 0;
        for(int elem : pushed) {
            stack.push(elem);
            while(!stack.isEmpty() && idx < popped.length && stack.peek() == popped[idx]) {
                stack.pop();
                idx++;
            }
        }
        return idx == popped.length;
    }
}
