class Solution {
    public boolean rotateString(String s, String goal) {
      
      if (s.equals(goal)) return true;
    
      int i=1;
      int j=1;
      while(i<=s.length()-1) {
        
        StringBuilder str = new StringBuilder();
        
        str.append(s.substring(j));
        str.append(s.substring(0,j));
        
        if(str.toString().equals(goal)) {
          return true;
        }
        j++;
        i++;
        
      }
      
      return false;
      
    
        
    }
}
