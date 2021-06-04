class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      
      StringBuilder str1 = new StringBuilder();
      for (String str:word1) {
        str1.append(str);
      }
      
      StringBuilder str2 = new StringBuilder();
      for (String str:word2) {
        str2.append(str);
      }
      
      return str1.toString().equals(str2.toString());
    }
}
