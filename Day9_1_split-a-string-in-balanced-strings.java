class Solution {
    public int balancedStringSplit(String s) {
      
      
      int counter = 0;
      
      int Lcount = 0;
      int Rcount = 0;
      
      
      for (int i=0;i<s.length();i++) {
        
        if (s.charAt(i)=='R') {
          Rcount++;
        }
        
        if (s.charAt(i)=='L') {
          Lcount++;
        }
        if (Lcount==Rcount) {
          counter++;
          // Lcount =0;
          // Rcount = 0;
        }
      }
      return counter;
        
    }
}
