class Solution {
    public int calPoints(String[] ops) {
      
      Stack<Integer> stack = new Stack<>(); 
      for (String str: ops) {
        
        char ch = str.charAt(0);
        
        
        if (ch=='C') {
        // remove previous one.
          stack.pop();
          
        } else if (ch=='D') {
          // double the record.
          stack.push(stack.peek()*2);
        } else if (ch=='+') {
          // add two records.
          int first = stack.peek();
          stack.pop();
          int second = stack.peek();
          stack.push(first);
          stack.push(first+second);
        } else {
          int a = Integer.valueOf(str);
          stack.push(a);
        }
      }
      int sum=0;
      while(!stack.isEmpty()) {
        sum+=stack.pop();
      }
      
      return sum;  
        
    }
}
