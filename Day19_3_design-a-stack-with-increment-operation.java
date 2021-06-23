class CustomStack {
  
    int size;
  
    Stack<Integer> stack = new Stack<>();

    public CustomStack(int maxSize) {
        size = maxSize;
    }
    
    public void push(int x) {
      
      if (stack.size()<size) {
        stack.push(x);
      }
        
    }
    
    public int pop() {
      
    
        return stack.isEmpty() ? -1:stack.pop();
    }
    
    public void increment(int k, int val) {
      
      Stack<Integer> stack1 = new Stack<>();
      int counter=0;
      while(!stack.isEmpty()) {
        stack1.add(stack.pop());
        counter++;
      }
      counter=0;
      while(!stack1.isEmpty()&&counter<k) {
        stack.push(stack1.pop()+val);
        counter++;
      }
      
      while(!stack1.isEmpty()) {
        stack.push(stack1.pop());
      }
            
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
