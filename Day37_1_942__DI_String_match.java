class Solution {
    public int[] diStringMatch(String s) {
      
      int result[] = new int[s.length()+1];
      
      int I = 0;
      int D = s.length();
            
      for (int i=0;i<s.length();i++) {
        
        if (s.charAt(i)=='I') {
          result[i] = I;
          I++;
        } else {
          result[i] = D;
          D--;
        }   
        
      }
      
      if (s.charAt(0)=='I') {
        result[result.length-1] = I;
      } else {
        result[result.length-1] = D;
      }
      return result;
        
    }
}
