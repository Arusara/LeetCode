class Solution {
    public String reverseWords(String s) {
      
      int count=0;
      StringBuilder result = new StringBuilder();
      for (int i=0;i<s.length();i++) {
        int ch = s.charAt(i);
        if (ch==32 || i==s.length()-1) {
          
          if (result.length()>0) {
            result.append(" ");
          }
        
          int j=i-1;
          if (i==s.length()-1) j=i;
          while(j>=0) {
            char ch1 = s.charAt(j);
            if(ch1==' ') break;
            result.append(ch1);
            j--;
          }
        }  
      }
      
      return result.toString();
        
    }
}
