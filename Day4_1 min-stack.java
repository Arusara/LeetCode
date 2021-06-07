class MinStack {

    /** initialize your data structure here. */
    int top = 0;
    Stack<Integer> stack;
    Stack<Integer> stack1;
    public MinStack() {
      stack = new Stack<>();
      stack1 = new Stack<>();
    }
    
    public void push(int value) {
      stack.push(value);
      
      if (!stack1.isEmpty() && value>stack1.peek()) {
        stack1.push(stack1.peek());
      } else {
        stack1.push(value);
      }

    }
    
    public void pop() {
        stack.pop();
        stack1.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return stack1.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
