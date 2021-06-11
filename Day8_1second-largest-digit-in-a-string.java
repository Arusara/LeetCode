class Solution {
    public int secondHighest(String s) {
      
      int first  = -1;
      int second = -1;
      for (int i=0;i<s.length();i++) {
        
        char a = s.charAt(i);
        
        if (Character.isDigit(a)) {
          
          int a1 = a-'0';
          
          if (a1>first) {
            second = first;
            first = a1;
          }
          else if (a1<first && a1>second) {
            second =a1;
          }
          
        
        }
        
        
      }
      return second;
        
    }
}
