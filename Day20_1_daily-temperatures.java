class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
      
      Stack<Integer> stack = new Stack<>();
      int n= temperatures.length;
      int result[] = new int[n];
      
      int i=0;
      for(int val:temperatures) {
        
        while(!stack.isEmpty()&& val>temperatures[stack.peek()]) {
          result[stack.peek()] = i - stack.pop();
        }
        
        stack.push(i);
        i++;
      }
      
      return result;
        
    }
}
