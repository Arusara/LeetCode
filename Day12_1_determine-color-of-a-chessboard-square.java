class Solution {
    public boolean squareIsWhite(String s) {
      
      int ch1 = s.charAt(0)-'a';
      int ch2 = s.charAt(1)-48;
      
      System.out.println(ch1+" "+ch2);
      
      
      if((ch1+ch2)%2==0){
        return true;
      }
      return false;
        
    }
}
