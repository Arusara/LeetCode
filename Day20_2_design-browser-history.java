class BrowserHistory {
  
    Stack<String> visit = new Stack<>();
    Stack<String> forward = new Stack<>();
  String homepage;

    public BrowserHistory(String homepage) {
      this.homepage = homepage;
    }
    
    public void visit(String url) {
      visit.push(url);
      if (!forward.isEmpty()) forward = new Stack<>();
    }
    
    public String back(int steps) {
      
      
      int counter=0;
      while(!visit.isEmpty()&&counter<steps) {
        forward.push(visit.pop());
        counter++;
      }
  
      return visit.isEmpty() ? this.homepage : visit.peek();
      
    }
    
    public String forward(int steps) {
      
      int counter = 0;
      while(!forward.isEmpty()&&counter<steps) {
        visit.push(forward.pop());
        counter++;
      }
      return visit.isEmpty() ? this.homepage  : visit.peek();
    
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
