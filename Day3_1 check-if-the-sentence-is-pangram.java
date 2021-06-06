class Solution {
    public boolean checkIfPangram(String sentence) {
      
      
      int a[]= new int[26];

      for (int i=0;i<sentence.length();i++) {
        int a1 = sentence.charAt(i)-'a';
        a[a1] = a[a1]+1;
      }
      
      for(int i=0;i<a.length;i++) {
        
        
        if(a[i]<=0) {
          return false;
        }
        
      }
      
      return true;
        
    }
}
