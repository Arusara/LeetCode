class Solution {
    public boolean backspaceCompare(String s, String t) {
      
      Stack<Character> stack1 = new Stack<>();
      for (int i=0;i<s.length();i++) {
        char ch = s.charAt(i);
        
        if (ch=='#' && !stack1.isEmpty()) {
          stack1.pop();
        } else {
          stack1.push(ch);
        }
        
        
      }
      
      Stack<Character> stack2 = new Stack<>();

      for (int i=0;i<t.length();i++) {
        char ch = t.charAt(i);
        
        if (ch=='#' && !stack2.isEmpty()) {
          stack2.pop();
        } else {
          stack2.push(ch);
        }
      
      }
      
      if (stack1.isEmpty()&&stack2.isEmpty()) {
        return true;
      }
      
      System.out.println(stack1.toString());
      System.out.println(stack2.toString());

      
      while(!stack1.isEmpty() && !stack2.isEmpty()) {
        
        if (stack1.peek()=='#') {
          stack1.pop();
          continue;
        }
        if (stack2.peek()=='#') {
          stack2.pop();
          continue;
        }
        if (stack1.peek()!=stack2.peek()) return false;
        stack1.pop();
        stack2.pop();
      }
      
      while(!stack1.isEmpty()) {
        if(stack1.peek()!='#') 
          return false;
        stack1.pop();
      }
      
      while(!stack2.isEmpty()) {
        if(stack2.peek()!='#') 
          return false;
        stack2.pop();
      }
      

      return true;
      
      
      
      
        
    }
}
