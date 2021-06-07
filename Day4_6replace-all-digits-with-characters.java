class Solution {
    public String replaceDigits(String s) {
      
      StringBuilder str = new StringBuilder();
      for (int i=0;i<s.length();i++) {
        
        if (i==s.length()-1) {
          str.append(s.charAt(i));
          return str.toString();
        }
        
        int ch1 = (int) s.charAt(i+1)-'0';
        int ch2 = (int) s.charAt(i);
        ch2+=ch1;
        
        char c = (char)ch2;
        
        str.append(s.charAt(i)).append(c);
        i++;
      }
      return str.toString();
    }
}
