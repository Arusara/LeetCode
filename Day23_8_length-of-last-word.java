class Solution {
    public int lengthOfLastWord(String s) {
      
      if (s==null)
        return 0;
      
      if (s.trim().length()==0) {
        return 0;
      }
      
      s=s.trim();
      
      int space=-1;
      
      for (int i=0;i<s.length();i++) {
        
        int ch = s.charAt(i);
        
        if (ch==32) {
          space = i;
        }
      
      }
      
      return s.substring(space+1).length();
        
    }
}
