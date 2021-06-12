class Solution {
    public int maxDepth(String s) {
      
      int openCount = 0;
      int max = Integer.MIN_VALUE;
      for(int i=0;i<s.length();i++) {
        
        
        if (s.charAt(i)=='(') {
          openCount++;
        }
        
        if(s.charAt(i)==')') {
          openCount--;
        }
        
        if (openCount>max) {
          max=openCount;
        }
        
      }
      
      return max;
      
      
    }
}
