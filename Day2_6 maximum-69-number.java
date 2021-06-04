class Solution {
    public int maximum69Number (int num) {
      
      String str = String.valueOf(num);
      
      StringBuilder str1 = new StringBuilder();
      boolean done= false;
      for (int i=0;i<str.length();i++) {
        if (str.charAt(i)=='6' && !done) {
          str1.append("9");
          done = true;
        } else {
          str1.append(str.charAt(i));
        }
      }
      
      return Integer.valueOf(str1.toString());
      
      
      
        
    }
}
