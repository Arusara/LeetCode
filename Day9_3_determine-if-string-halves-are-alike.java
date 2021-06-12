class Solution {
    public boolean halvesAreAlike(String s) {
      
      
      int leftCount = 0;
      for(int i=0;i<s.length()/2;i++){
        
        char ch = s.charAt(i);
        if(isVowel(ch)) {
          leftCount++;
        } 
      
      }
      
      int rightCount=0;
      for(int i=s.length()/2;i<s.length();i++) {
        
        char ch = s.charAt(i);
        
        if(isVowel(ch)) {
          rightCount++;
        }
      }
      
      return leftCount==rightCount;
    
      
    }
      
      
            
            public static boolean isVowel(char ch) {
              return (ch=='a' || ch=='e' || ch=='i' || ch =='o' || ch =='u' || ch=='A' || ch=='E' || ch =='I' || ch=='O' || ch=='U');
            }
}
