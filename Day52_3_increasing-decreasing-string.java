class Solution {
    public String sortString(String s) {
      
      int a[]=new int[26];
      for(int i=0;i<s.length();i++) {
        a[s.charAt(i)-'a']++;
      }
      
      int count=0;
      StringBuilder result = new StringBuilder();
      while(count<s.length()) {
        
        for(int i=0;i<26;i++) {
          if (a[i]>0) {
          char c=(char)(i+65);
          result.append(c);
          count++;
          a[i]--;
          }
        }
        
        for(int i=25;i>=0;i--) {
          if (a[i]>0) {
          char c=(char)(i+65);
          result.append(c);
          count++;
            a[i]--;
          }
        }
      }
      
      
     // System.out.println(Arrays.toString(a));
      
      return result.toString().toLowerCase();
        
    }
}
