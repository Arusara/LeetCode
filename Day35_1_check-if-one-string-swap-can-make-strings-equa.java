class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
      
      if (s1.length()!=s2.length()) return false;
      
      if (s1.equals(s2)) return true;
      
      int count=0;
      int a=0;
      int b=0;
      int c=0;
      int d=0;
      for (int i=0;i<s1.length();i++) {
        
        if (s1.charAt(i)!=s2.charAt(i))  {
          count++;
          
          if (count==1) {
            a = s1.charAt(i);
            b = s2.charAt(i);
          }
          
          if (count==2) {
            c = s1.charAt(i);
            d = s2.charAt(i);
          }
        }
        
        
      }
      
      return count==2 && (a==d && b==c);
        
    }
}
