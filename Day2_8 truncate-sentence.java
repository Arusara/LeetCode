class Solution {
    public String truncateSentence(String s, int k) {
      
      String s1[] = s.split(" ");
      StringBuilder str = new StringBuilder(s1[0]);
      for (int i=1;i<k;i++) {
        str.append(" "+s1[i]);
      }
      
      return str.toString();
        
    }
}
