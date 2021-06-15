class Solution {
    public String freqAlphabets(String s) {
      
      StringBuilder result = new StringBuilder();
      int i=0;
      int n=s.length();
      while(i<n) {
        if (i<n-2 && s.charAt(i+2)=='#') {
          String char2 = s.substring(i, i+2);
          i=i+3;          
          char ch1 = (char) (Integer.parseInt(char2)+96);
          result.append(ch1);
        } else {
          int num = s.charAt(i)-48;
          char ch = (char) (num+96);
          result.append(ch);
          i++;
        }
      }
      
      return result.toString();
        
    }

}
