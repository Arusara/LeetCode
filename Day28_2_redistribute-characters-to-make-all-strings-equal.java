class Solution {
    public boolean makeEqual(String[] words) {
      
      int a[]=new int[26];
      
      for (int i=0;i<words.length;i++) {
        for (int j=0;j<words[i].length();j++) {
          int ch = words[i].charAt(j)-'a';
          a[ch]++;
        }
      }
      
      int length = words.length;
      for(int i=0;i<26;i++) { 
        if (a[i]%length!=0) {
          return false;
        }
      }
      return true;
    }
}
