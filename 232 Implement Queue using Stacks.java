class MyQueue {
    private Stack<Integer> input=new Stack<>();
    private Stack<Integer> output=new Stack<>();

    public MyQueue() {
        Queue<Integer> queue = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        while(!input.isEmpty()) {
            output.push(input.pop());
            
        }
        int ans=output.pop();
        while(!output.isEmpty()) {
            input.push(output.pop());
        }
        return ans;
    }
    
    public int peek() {
        while(!input.isEmpty()) {
            output.push(input.pop());
            
        }
        int ans=output.peek();
        while(!output.isEmpty()) {
            input.push(output.pop());
        }
        return ans;
        
    }
    
    public boolean empty() {
        return input.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
