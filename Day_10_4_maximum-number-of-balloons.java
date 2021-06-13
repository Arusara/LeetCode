class Solution {
    public int maxNumberOfBalloons(String text) {
      
      
      int bCount=0;
      int aCount=0;
      int lCount=0;      
      int oCount=0;
      int nCount=0;
      
      
      for(int i=0;i<text.length();i++) {
         
        char ch = text.charAt(i);
        
        if (ch=='b') {
          bCount++;
        }
        
        if(ch=='a') {
          aCount++;
        }
        
        if(ch=='l') {
          lCount++;
        }
        
        if(ch=='o') {
          oCount++;
        }
        
        if(ch=='n'){
          nCount++;
        }
      }
      
      lCount=lCount/2;
      oCount=oCount/2;
      
      
      int result = Integer.MAX_VALUE;
      
      
      if (bCount<result) {
        result=bCount;
      }
      
      if (aCount<result) {
        result=aCount;
      }
      if (lCount<result) {
        result=lCount;
      }
      if (oCount<result) {
        result=oCount;
      }
      
      if (bCount<result) {
        result=nCount;
      }
      
      return result;
    
        
    }
}
