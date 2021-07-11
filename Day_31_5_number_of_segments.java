class Solution {
    public int countSegments(String s) {
      
      if (s==null) return 0;
      
      s=s.trim();
      int result =0;
      char prevChar = 'a';
      for (int i=0;i<s.length();i++) {
        
        int ch = s.charAt(i);
        
        if (i!=0 && ch==32 && s.charAt(i-1)!=' ') result++;
        
      }
      
      return s.length()>0 ? result+1 : 0;
        
    }
}
