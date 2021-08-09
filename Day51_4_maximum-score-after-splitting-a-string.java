class Solution {
    public int maxScore(String s) {
      
      int oneCount=0;
      for(int i=0;i<s.length();i++) {
        
        int ch = s.charAt(i)-'0';
        if (ch==1) oneCount++;
      }
      
      int zeroCount= s.length()-oneCount;
      
      int resultZero=0;
      int resultOne=0;
      
      if(s.charAt(0)=='0') resultZero++;
      else resultOne++;
      
      int max=0;
  
      for(int i=1;i<s.length();i++) {
        
        int val = resultZero+(oneCount-resultOne);
        
        max = Math.max(max,val);
        
        
        if (s.charAt(i)=='0') resultZero++;
        else resultOne++;
        
        
      
      }

      
      return max;
        
    }
}
