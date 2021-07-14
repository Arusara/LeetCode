class Solution {
    public String countAndSay(int n) {
      
      if (n<=0) {
        return "";
      }
      
      String s="1";
      for (int i=2;i<=n;i++) {
         s = convert(s);
      }
      return s;
      
        
    }
  
  
  private static String convert(String str) {
        int count=1;
       StringBuilder resultBuilder = new StringBuilder();
       for (int i=1;i<str.length();i++) {

           int prevChar = str.charAt(i-1);
           int currChar = str.charAt(i);

           if (prevChar==currChar) count++;
           else {
               resultBuilder.append(count).append(str.charAt(i-1));
               count = 1;
           }
       }
      resultBuilder.append(count).append(str.charAt(str.length()-1));
      return resultBuilder.toString();
    
   
  } 

    
}
