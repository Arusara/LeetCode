class Solution {
    public String makeGood(String s) {
      
      Stack<Character> stack = new Stack<>();
      
      for (int i=0;i<s.length();i++) {    
        char ch = s.charAt(i);
    
        if (Character.isUpperCase(ch) && !stack.isEmpty()) {
          
        if (ch!=stack.peek()&&Character.toUpperCase(stack.peek()) == ch) {
           stack.pop();
         } else {
           stack.push(ch);
         }
          
        } else if (Character.isLowerCase(ch)&&!stack.isEmpty()) {
          
         if (ch!=stack.peek()&&Character.toLowerCase(stack.peek()) == ch) {
           stack.pop();
         } else {
           stack.push(ch);
         }
          
        } else {
          stack.push(ch);
        }
      } 
      
      StringBuilder str = new StringBuilder();
      for(char ch: stack) {
        str.append(ch);
      }
      
      return str.toString();
        
    }
}
