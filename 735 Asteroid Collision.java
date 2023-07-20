class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i : asteroids) {
            if(stack.isEmpty() || i > 0) {
                stack.push(i);
            }else {
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(i)) {
                    stack.pop();
                }
                if(!stack.isEmpty() && stack.peek() == Math.abs(i)) {
                    stack.pop();
                }else if(stack.isEmpty() || stack.peek() < 0){
                    stack.push(i);
                }
            }
        }
        int astroidleft[] = new int[stack.size()];
        int len = stack.size();
        while(!stack.isEmpty()) {
            astroidleft[--len] = stack.pop();
        }
        return astroidleft;
    }
}
